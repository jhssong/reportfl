{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/Nysiis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Nysiis",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 70,
      "end_line": 319,
      "comment": "\n * Encodes a string into a NYSIIS value. NYSIIS is an encoding used to relate similar names, but can also be used as a\n * general purpose scheme to find word with similar phonemes.\n * \u003cp\u003e\n * NYSIIS features an accuracy increase of 2.7% over the traditional Soundex algorithm.\n * \u003cp\u003e\n * Algorithm description:\n * \u003cpre\u003e\n * 1. Transcode first characters of name\n *   1a. MAC -\u0026gt;   MCC\n *   1b. KN  -\u0026gt;   NN\n *   1c. K   -\u0026gt;   C\n *   1d. PH  -\u0026gt;   FF\n *   1e. PF  -\u0026gt;   FF\n *   1f. SCH -\u0026gt;   SSS\n * 2. Transcode last characters of name\n *   2a. EE, IE          -\u0026gt;   Y\n *   2b. DT,RT,RD,NT,ND  -\u0026gt;   D\n * 3. First character of key \u003d first character of name\n * 4. Transcode remaining characters by following these rules, incrementing by one character each time\n *   4a. EV  -\u0026gt;   AF  else A,E,I,O,U -\u0026gt; A\n *   4b. Q   -\u0026gt;   G\n *   4c. Z   -\u0026gt;   S\n *   4d. M   -\u0026gt;   N\n *   4e. KN  -\u0026gt;   N   else K -\u0026gt; C\n *   4f. SCH -\u0026gt;   SSS\n *   4g. PH  -\u0026gt;   FF\n *   4h. H   -\u0026gt;   If previous or next is nonvowel, previous\n *   4i. W   -\u0026gt;   If previous is vowel, previous\n *   4j. Add current to key if current !\u003d last key character\n * 5. If last character is S, remove it\n * 6. If last characters are AY, replace with Y\n * 7. If last character is A, remove it\n * 8. Collapse all strings of repeated characters\n * 9. Add original first character of name as first character of key\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/NYSIIS\"\u003eNYSIIS on Wikipedia\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.dropby.com/NYSIIS.html\"\u003eNYSIIS on dropby.com\u003c/a\u003e\n * @see Soundex\n * @since 1.7\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_A"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_AF"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_C"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_FF"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_G"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_N"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_NN"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_S"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHARS_SSS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_MAC"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_KN"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_K"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_PH_PF"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_SCH"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_EE_IE"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAT_DT_ETC"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRUE_LENGTH"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.isVowel(char)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Tests if the given character is a vowel.\n     *\n     * @param c\n     *            the character to test\n     * @return {@code true} if the character is a vowel, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.transcodeRemaining(char, char, char, char)",
      "begin_line": 118,
      "end_line": 168,
      "comment": "\n     * Transcodes the remaining parts of the String. The method operates on a sliding window, looking at 4 characters at\n     * a time: [i-1, i, i+1, i+2].\n     *\n     * @param prev\n     *            the previous character\n     * @param curr\n     *            the current character\n     * @param next\n     *            the next character\n     * @param aNext\n     *            the after next character\n     * @return a transcoded array of characters, starting from the current position\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 130,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 145,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Indicates the strict mode. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Nysiis.Nysiis()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Creates an instance of the {@link Nysiis} encoder with strict mode (original form),\n     * i.e. encoded strings have a maximum length of 6.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Nysiis.Nysiis(boolean)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Create an instance of the {@link Nysiis} encoder with the specified strict mode:\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code true}: encoded strings have a maximum length of 6\u003c/li\u003e\n     *  \u003cli\u003e{@code false}: encoded strings may have arbitrary length\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param strict\n     *            the strict mode\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.encode(java.lang.Object)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\n     * Encodes an Object using the NYSIIS algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an {@link EncoderException} if the supplied object is not of type\n     * {@link String}.\n     *\n     * @param obj\n     *            Object to encode\n     * @return An object (or a {@link String}) containing the NYSIIS code which corresponds to the given String.\n     * @throws EncoderException\n     *            if the parameter supplied is not of a {@link String}\n     * @throws IllegalArgumentException\n     *            if a character is not mapped\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.encode(java.lang.String)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Encodes a String using the NYSIIS algorithm.\n     *\n     * @param str\n     *            A String object to encode\n     * @return A Nysiis code corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *            if a character is not mapped\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.isStrict()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Indicates the strict mode for this {@link Nysiis} encoder.\n     *\n     * @return {@code true} if the encoder is configured for strict mode, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Nysiis.nysiis(java.lang.String)",
      "begin_line": 247,
      "end_line": 317,
      "comment": "\n     * Retrieves the NYSIIS code for a given String object.\n     *\n     * @param str\n     *            String to encode using the NYSIIS algorithm\n     * @return A NYSIIS code for the String supplied\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 253,col 9)-(line 253,col 38)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 261,col 9)-(line 261,col 55)",
        "(line 262,col 9)-(line 262,col 53)",
        "(line 263,col 9)-(line 263,col 51)",
        "(line 264,col 9)-(line 264,col 56)",
        "(line 265,col 9)-(line 265,col 55)",
        "(line 269,col 9)-(line 269,col 55)",
        "(line 270,col 9)-(line 270,col 56)",
        "(line 273,col 9)-(line 273,col 66)",
        "(line 274,col 9)-(line 274,col 34)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 278,col 37)",
        "(line 280,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 45)",
        "(line 316,col 9)-(line 316,col 102)"
      ]
    }
  ]
}