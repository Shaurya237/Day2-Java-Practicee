# Week 2 Java Assignment

Five independent Java solutions for the Week 2 live-coding problems.

## Files
1. `AtmPinLengthValidator.java`
2. `WordReversalEncoder.java`
3. `ProductInventoryCsvParser.java`
4. `LibraryIsbnNormalizerValidator.java`
5. `StopWordFilteredWordFrequency.java`

## Compile and run
Run these commands from this folder, replacing `ClassName` with the desired class name:

```bash
javac AtmPinLengthValidator.java
java AtmPinLengthValidator
```

Repeat with the corresponding filename/class name for each problem.

## Notes
- The ATM PIN problem follows the assignment's requested length-only check; it does not validate that the four characters are numeric.
- The ISBN-style validator checks the stated 13-character structure and digit/letter positions. It does not validate whether the year is a real calendar year.
- The word-frequency program removes periods and commas as specified and excludes the given stop words.
