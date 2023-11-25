# Chess Language Translation

There is a magical chess kingdom where chess pieces speak a language unique to their kind. However, the language used among all chess pieces isn't uniform and thus it causes a lot of confusion in their communication.

In the given language, every word is represented as a string of Latin lowercase letters. The chess pieces have a special dictionary to translate words from one piece's language to another. For each piece's language, there is a string of 26 lowercase Latin letters. This string shows how a letter from the source piece's language is translated into a letter in the target piece's language.

For instance, if the string is "qwertyuiopasdfghjklzxcvbnm", then 'a' in the source language is translated to 'q' in the target language, 'b' to 'w', 'c' to 'e', and so on. It is guaranteed that each letter in the string is unique.

Given a source piece's language, a target piece's language, and a sentence in the source language, your task is to translate the sentence into the target language.

## Input Format

The first line of input will contain the source piece's language as a string of 26 lowercase Latin letters.

The second line of input will contain the target piece's language as a string of 26 lowercase Latin letters.

The third line of input will contain the sentence in the source language. The sentence consists of lowercase Latin letters and spaces. The length of the sentence does not exceed 1000 characters.

## Output Format

The output should be a single line containing the translated sentence in the target language.

### Sample Input

```
abcdefghijklmnopqrstuvwxyz
qwertyuiopasdfghjklzxcvbnm
the quick brown fox jumps over the lazy dog
```

### Sample Output

```
zit jxoea wkgvf ygb pxdhl gctk zit sqmn rgu
```

#### Explanation

Translating "the quick brown fox jumps over the lazy dog" using the provided mapping gives "zit jxoea wkgvf ygb pxdhl gctk zit sqmn rgu". 
Each letter in the sentence is replaced with its counterpart from the target language's alphabet. For example, 't' → 'z', 'h' → 'i', 'e' → 't', resulting in "zit" as the translation for "the", and so on for the rest of the sentence.
Spaces between words are retained, ensuring the structure of the sentence remains intact.

**By:** Khosraw Azizi
