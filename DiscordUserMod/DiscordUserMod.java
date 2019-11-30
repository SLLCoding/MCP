package your.package;

public class DiscordUserMod extends ModDraggable {

	@Override
	public int getWidth() {
		return font.getStringWidth([Data Class].getDiscordUsername());
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}
  
  // IMPORTANT: Requires a variable with the username stored inside, this is set in the DiscordRP#start().
	@Override
	public void render(ScreenPosition pos) {
		if ([Data Class].getDiscordUsername() != null) {
			font.drawString("Discord: " + [Data Class].getDiscordUsername(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		}
		else {
      // Isn't using Discord.
			font.drawString("", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		}
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		font.drawString([Data Class].getDiscordUsername(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}

}
