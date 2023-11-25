def translate_sentence(source_lang, target_lang, sentence):
    # Creating a translation dictionary
    translation_dict = {source_lang[i]: target_lang[i] for i in range(26)}

    # Translating the sentence
    translated_sentence = ''.join([translation_dict[char] if char != ' ' else ' ' for char in sentence])

    return translated_sentence

def main():
    # Accepting input
    source_language = input("")
    target_language = input("")
    sentence = input("")

    # Translate the sentence
    translated_sentence = translate_sentence(source_language, target_language, sentence)

    # Output the translated sentence
    print("", translated_sentence)

if __name__ == "__main__":
    main()
