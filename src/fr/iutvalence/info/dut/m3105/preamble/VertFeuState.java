package fr.iutvalence.info.dut.m3105.preamble;

public class VertFeuState extends FeuStateAbstract
{

	private TrafficSignalState couleurFeu;
	private int t;
	
	@Override
	public void changeCouleur()
	{
		this.couleurFeu = this.couleurFeu.ORANGE;
		this.t = 2;
	}

	@Override
	public void tick()
	{
		while (t != 0) {
			t--;
		}
	}

	@Override
	public void appuiBouton()
	{
		// TODO Auto-generated method stub
		super.appuiBouton();
	}

}
