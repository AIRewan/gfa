import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonMain {
  public static void main(String[] args) {
    List<Pokemon> pokemonListOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "grass", "water");

    // Which pokemon should Ash use?
    // Write the necessary code to get the name of the right pokemon and print it:

    Pokemon chosen = pokemonListOfAsh.stream().filter(i-> i.effectiveAgainst.equals("grass")).toList().getFirst();
    System.out.print("I choose you, "+chosen.name);
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Bulbasaur", "grass", "water"));
    pokemon.add(new Pokemon("Pikachu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "grass"));
    pokemon.add(new Pokemon("Pidgeot", "flying", "fighting"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}