# Universal Pokemon Randomizer - WarpStart Support

This is a modification of Dabomstew's Universal Pokemon Randomizer that supports my Pokemon Ruby WarpStart hack, which is intended to be used for randomizer races. It also adds a few new features and bug fixes (see below for a full list).

For usage instructions, refer to the original UPR's [README](readme.txt).

The standard, non-hacked gen 1-5 games still work with this mod! You can completely replace your use of the standard randomizer with this one if you want, but be wary that **settings files made with this modded randomizer are incompatible with the standard randomizer** because of its added features.

---

**NOTE:** Only **v1.0** of English Pokemon **Ruby** is currently supported for WarpStart. See the instructions on the Ruby WarpStart page for information on setting up a compatible ROM. 

---

**NEW FEATURES:**
- Support for my Ruby WarpStart hack.
- Added option to remove happiness evos. (Makes baby Pokemon viable starters, as WarpStart races are intended to be fairly short.)
- Added option to prefer evolution targets with a higher base-stat total when evolutions are randomized. (By default, UPR prefers lower and higher BST targets equally).

**INCLUDED BUG FIXES:**
- Imported the [fastest text fix](https://github.com/Ajarmar/universal-pokemon-randomizer-zx/commit/eae6fd1cb8b4a20e2a1c10f72de15ce91059b066) for Black/White used in [Ajarmar's mod](https://github.com/Ajarmar/universal-pokemon-randomizer-zx) of UPR. (This should hopefully prevent random crashes that would occur when fastest text was enabled in the original UPR for B/W.)
- Imported [a fix](https://github.com/Ajarmar/universal-pokemon-randomizer-zx/commit/0d961f017e474642ce626dcbd21b6598e504c4c1#diff-d37144d82bcb7fa9bf6787a51b464c0f) for Gen 5 abilities not being included in the randomized abilities pool, also from [Ajarmar's mod](https://github.com/Ajarmar/universal-pokemon-randomizer-zx) of UPR.
- Imported [a fix](https://github.com/Dabomstew/universal-pokemon-randomizer/pull/52) by Hejsil that fixes game-breaking moves not being removed when movesets are not randomized, even if the option is selected.
- Imported [some code changes](https://github.com/Dabomstew/universal-pokemon-randomizer/commit/ca00ce4bc8813b90ce0c869b1ab03ac702d8c267) made in the Speedchoice branch of the original UPR to allow for developing with Java 9+. (This allows the project to be debugged in Visual Studio Code!)

---

BASIC EXPLANATION OF HOW IT WORKS:

The primary change the mod makes is to detect the WarpStart hack, and if it does, search for the new offsets where the needed data is located. 

A new file named RubyPrefixes lists the first several bytes each piece of data should have. These hex strings were made to be reasonably long to avoid duplicates, but not include data that will change while making changes to the ROM that are within its goals. (For example, I know I won't be changing Pokemon data, so I can expect that the beginning of that data section will be the same.)

Finding the new offsets dynamically like this means that, for example, someone can change the number of Rare Candies each area gives to a Pokemon, recompile the ROM, and have the randomizer still work, without any changes being necessary.

---

You can find the original Universal Pokemon Randomizer here: https://wwww.github.com/Dabomstew/universal-pokemon-randomizer
