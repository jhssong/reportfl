{
  "filepath": "/tmp/Codec-16b/src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DaitchMokotoffSoundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 72,
      "end_line": 561,
      "comment": "\n * Encodes a string into a Daitch-Mokotoff Soundex value.\n * \u003cp\u003e\n * The Daitch-Mokotoff Soundex algorithm is a refinement of the Russel and American Soundex algorithms, yielding greater\n * accuracy in matching especially Slavish and Yiddish surnames with similar pronunciation but differences in spelling.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The main differences compared to the other soundex variants are:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003ecoded names are 6 digits long\n * \u003cli\u003ethe initial character of the name is coded\n * \u003cli\u003erules to encoded multi-character n-grams\n * \u003cli\u003emultiple possible encodings for the same name (branching)\n * \u003c/ul\u003e\n * \u003cp\u003e\n * This implementation supports branching, depending on the used method:\n * \u003cul\u003e\n * \u003cli\u003e{@link #encode(String)} - branching disabled, only the first code will be returned\n * \u003cli\u003e{@link #soundex(String)} - branching enabled, all codes will be returned, separated by \u0027|\u0027\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Note: this implementation has additional branching rules compared to the original description of the algorithm. The\n * rules can be customized by overriding the default rules contained in the resource file\n * {@code org/apache/commons/codec/language/dmrules.txt}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is thread-safe.\n * \u003c/p\u003e\n *\n * @see Soundex\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Daitch%E2%80%93Mokotoff_Soundex\"\u003e Wikipedia - Daitch-Mokotoff Soundex\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.avotaynu.com/soundex.htm\"\u003eAvotaynu - Soundexing and Genealogy\u003c/a\u003e\n *\n * @version $Id$\n * @since 1.10\n "
    },
    {
      "type": "class_interface",
      "name": "Branch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 157,
      "comment": "\n     * Inner class representing a branch during DM soundex encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "builder"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cachedString"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastReplacement"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.Branch()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 42)",
        "(line 84,col 13)-(line 84,col 35)",
        "(line 85,col 13)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.createBranch()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n         * Creates a new branch, identical to this branch.\n         *\n         * @return a new, identical branch\n         ",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 47)",
        "(line 95,col 13)-(line 95,col 46)",
        "(line 96,col 13)-(line 96,col 58)",
        "(line 97,col 13)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.equals(java.lang.Object)",
      "begin_line": 100,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 104,col 13)",
        "(line 105,col 13)-(line 107,col 13)",
        "(line 109,col 13)-(line 109,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.finish()",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n         * Finish this branch by appending \u00270\u0027s until the maximum code length has been reached.\n         ",
      "child_ranges": [
        "(line 116,col 13)-(line 119,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.hashCode()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.processNextReplacement(java.lang.String, boolean)",
      "begin_line": 135,
      "end_line": 148,
      "comment": "\n         * Process the next replacement to be added to this branch.\n         *\n         * @param replacement\n         *            the next replacement to append\n         * @param forceAppend\n         *            indicates if the default processing shall be overridden\n         ",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 116)",
        "(line 138,col 13)-(line 145,col 13)",
        "(line 147,col 13)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch.toString()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 154,col 13)",
        "(line 155,col 13)-(line 155,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 162,
      "end_line": 207,
      "comment": "\n     * Inner class for storing rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacementAtStart"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacementBeforeVowel"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacementDefault"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.Rule(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 35)",
        "(line 171,col 13)-(line 171,col 70)",
        "(line 172,col 13)-(line 172,col 78)",
        "(line 173,col 13)-(line 173,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.getPatternLength()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.getReplacements(java.lang.String, boolean)",
      "begin_line": 180,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 183,col 13)",
        "(line 185,col 13)-(line 185,col 53)",
        "(line 186,col 13)-(line 186,col 118)",
        "(line 187,col 13)-(line 189,col 13)",
        "(line 191,col 13)-(line 191,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.isVowel(char)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.matches(java.lang.String)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.toString()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 205,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "COMMENT"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_QUOTE"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTILINE_COMMENT_END"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTILINE_COMMENT_START"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESOURCE_FILE"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The resource file containing the replacement and folding rules "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LENGTH"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The code length of a DM soundex value. "
    },
    {
      "type": "field",
      "varNames": [
        "RULES"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " Transformation rules indexed by the first character of their pattern. "
    },
    {
      "type": "field",
      "varNames": [
        "FOLDINGS"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Folding rules. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.Anonymous-956f2f6e-a4c2-44a6-9990-ee7f43e17ded.compare(org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule, org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 21)-(line 244,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.parseRules(java.util.Scanner, java.lang.String, java.util.Map\u003cjava.lang.Character, java.util.List\u003corg.apache.commons.codec.language.DaitchMokotoffSoundex.Rule\u003e\u003e, java.util.Map\u003cjava.lang.Character, java.lang.Character\u003e)",
      "begin_line": 250,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 28)",
        "(line 253,col 9)-(line 253,col 43)",
        "(line 255,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.stripQuotes(java.lang.String)",
      "begin_line": 331,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "folding"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Whether to use ASCII folding prior to encoding. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.DaitchMokotoffSoundex()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Creates a new instance with ASCII-folding enabled.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.DaitchMokotoffSoundex(boolean)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Creates a new instance.\n     * \u003cp\u003e\n     * With ASCII-folding enabled, certain accented characters will be transformed to equivalent ASCII characters, e.g.\n     * è -\u0026gt; e.\n     * \u003c/p\u003e\n     *\n     * @param folding\n     *            if ASCII-folding shall be performed before encoding\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.cleanup(java.lang.String)",
      "begin_line": 377,
      "end_line": 391,
      "comment": "\n     * Performs a cleanup of the input string before the actual soundex transformation.\n     * \u003cp\u003e\n     * Removes all whitespace characters and performs ASCII folding if enabled.\n     * \u003c/p\u003e\n     *\n     * @param input\n     *            the input string to cleanup\n     * @return a cleaned up string\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.encode(java.lang.Object)",
      "begin_line": 411,
      "end_line": 418,
      "comment": "\n     * Encodes an Object using the Daitch-Mokotoff soundex algorithm without branching.\n     * \u003cp\u003e\n     * This method is provided in order to satisfy the requirements of the Encoder interface, and will throw an\n     * EncoderException if the supplied object is not of type java.lang.String.\n     * \u003c/p\u003e\n     *\n     * @see #soundex(String)\n     *\n     * @param obj\n     *            Object to encode\n     * @return An object (of type java.lang.String) containing the DM soundex code, which corresponds to the String\n     *         supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type java.lang.String\n     * @throws IllegalArgumentException\n     *             if a character is not mapped\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.encode(java.lang.String)",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n     * Encodes a String using the Daitch-Mokotoff soundex algorithm without branching.\n     *\n     * @see #soundex(String)\n     *\n     * @param source\n     *            A String object to encode\n     * @return A DM Soundex code corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *             if a character is not mapped\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.soundex(java.lang.String)",
      "begin_line": 462,
      "end_line": 473,
      "comment": "\n     * Encodes a String using the Daitch-Mokotoff soundex algorithm with branching.\n     * \u003cp\u003e\n     * In case a string is encoded into multiple codes (see branching rules), the result will contain all codes,\n     * separated by \u0027|\u0027.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: the name \"AUERBACH\" is encoded as both\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e097400\u003c/li\u003e\n     * \u003cli\u003e097500\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Thus the result will be \"097400|097500\".\n     * \u003c/p\u003e\n     *\n     * @param source\n     *            A String object to encode\n     * @return A string containing a set of DM Soundex codes corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *             if a character is not mapped\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 56)",
        "(line 464,col 9)-(line 464,col 53)",
        "(line 465,col 9)-(line 465,col 22)",
        "(line 466,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DaitchMokotoffSoundex.soundex(java.lang.String, boolean)",
      "begin_line": 485,
      "end_line": 560,
      "comment": "\n     * Perform the actual DM Soundex algorithm on the input string.\n     *\n     * @param source\n     *            A String object to encode\n     * @param branching\n     *            If branching shall be performed\n     * @return A string array containing all DM Soundex codes corresponding to the String supplied depending on the\n     *         selected branching mode\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 45)",
        "(line 492,col 9)-(line 492,col 72)",
        "(line 493,col 9)-(line 493,col 42)",
        "(line 495,col 9)-(line 495,col 29)",
        "(line 496,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 67)",
        "(line 553,col 9)-(line 553,col 22)",
        "(line 554,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 559,col 22)"
      ]
    }
  ]
}