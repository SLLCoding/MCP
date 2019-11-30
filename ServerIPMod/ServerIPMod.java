package your.package;

public class ServerIPMod extends ModDraggable {

	@Override
	public int getWidth() {
		return font.getStringWidth("IP: play.minecraft.server");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

  // IMPORTANT: Save IP to a static variable when joining a server, and set it to "SINGLEPLAYER" when joining a singleplayer world.
	@Override
	public void render(ScreenPosition pos) {
		if (![Data Class].getIP().equals("SINGLEPLAYER")) {
			font.drawString("IP: " + [Data Class].getIP(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		}
		else {
			font.drawString("", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		}
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		font.drawString("IP: play.minecraft.server", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}

}
