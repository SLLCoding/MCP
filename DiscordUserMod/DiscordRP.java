public void start() {
		
		this.created = System.currentTimeMillis();
		
		DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
			@Override
			public void apply(DiscordUser user) {
				[Data Class].setDiscordUsername(user.name + "#" + user.discriminator);
				update("Starting Minecraft");
			}
		}).build();
		
		DiscordRPC.discordInitialize("[CLIENT ID]", handlers, true);
		
		new Thread("Discord RPC Callback") {
			@Override
			public void run() {
				while (running) {
					DiscordRPC.discordRunCallbacks();
				}
			}
		}.start();
	}
