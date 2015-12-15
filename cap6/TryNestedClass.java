public class TryNestedClass{
	
	public static void main(String[] args){
		System.out.println(new MagicHat("Mazarop dos Correios"));
		System.out.println(new MagicHat("Chupetinha com Sharingan"));
		System.out.println(new MagicHat("Izoka cabelo liso"));
		MagicHat velhoChapel = new MagicHat("velho chapel");
		//System.out.println("An independent rabbit: " + new MagicHat.Rabbit());
		MagicHat.Rabbit rabbit = velhoChapel.new Rabbit();
		System.out.println(velhoChapel);
		System.out.println("\n novo coelho se chama" + rabbit);
	}
}