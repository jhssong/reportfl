{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhoneticEngine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 516,
      "comment": "\n * Converts words into potential phonetic representations.\n * \u003cp\u003e\n * This is a two-stage process. Firstly, the word is converted into a phonetic representation that takes\n * into account the likely source language. Next, this phonetic representation is converted into a\n * pan-European \u0027average\u0027 representation, allowing comparison between different versions of essentially\n * the same word from different languages.\n * \u003cp\u003e\n * This class is intentionally immutable and thread-safe.\n * If you wish to alter the settings for a PhoneticEngine, you\n * must make a new one with the updated settings.\n * \u003cp\u003e\n * Ported from phoneticengine.php\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "PhonemeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 156,
      "comment": "\n     * Utility for manipulating a set of phonemes as they are being built up. Not intended for use outside\n     * this package, and probably not outside the {@link PhoneticEngine} class.\n     *\n     * @since 1.6\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.empty(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n         * An empty builder where all phonemes must come from some set of languages. This will contain a single\n         * phoneme of zero characters. This can then be appended to. This should be the only way to create a new\n         * phoneme from scratch.\n         *\n         * @param languages the set of languages\n         * @return  a new, empty phoneme builder\n         ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "phonemes"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.PhonemeBuilder(org.apache.commons.codec.language.bm.Rule.Phoneme)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 62)",
        "(line 79,col 13)-(line 79,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.PhonemeBuilder(java.util.Set\u003corg.apache.commons.codec.language.bm.Rule.Phoneme\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.append(java.lang.CharSequence)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n         * Creates a new phoneme builder containing all phonemes in this one extended by \u003ccode\u003estr\u003c/code\u003e.\n         *\n         * @param str   the characters to append to the phonemes\n         ",
      "child_ranges": [
        "(line 92,col 13)-(line 94,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.apply(org.apache.commons.codec.language.bm.Rule.PhonemeExpr, int)",
      "begin_line": 106,
      "end_line": 126,
      "comment": "\n         * Applies the given phoneme expression to all phonemes in this phoneme builder.\n         * \u003cp\u003e\n         * This will lengthen phonemes that have compatible language sets to the expression, and drop those that are\n         * incompatible.\n         *\n         * @param phonemeExpr   the expression to apply\n         * @param maxPhonemes   the maximum number of phonemes to build up\n         ",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 95)",
        "(line 109,col 13)-(line 122,col 13)",
        "(line 124,col 13)-(line 124,col 34)",
        "(line 125,col 13)-(line 125,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.getPhonemes()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n         * Gets underlying phoneme set. Please don\u0027t mutate.\n         *\n         * @return  the phoneme set\n         ",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.makeString()",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n         * Stringifies the phoneme set. This produces a single string of the strings of each phoneme,\n         * joined with a pipe. This is explicitly provided in place of toString as it is a potentially\n         * expensive operation, which should be avoided when debugging.\n         *\n         * @return  the stringified phoneme set\n         ",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 57)",
        "(line 147,col 13)-(line 152,col 13)",
        "(line 154,col 13)-(line 154,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RulesApplication",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 170,
      "end_line": 233,
      "comment": "\n     * A function closure capturing the application of a list of rules to an input sequence at a particular offset.\n     * After invocation, the values \u003ccode\u003ei\u003c/code\u003e and \u003ccode\u003efound\u003c/code\u003e are updated. \u003ccode\u003ei\u003c/code\u003e points to the\n     * index of the next char in \u003ccode\u003einput\u003c/code\u003e that must be processed next (the input up to that index having been\n     * processed already), and \u003ccode\u003efound\u003c/code\u003e indicates if a matching rule was found or not. In the case where a\n     * matching rule was found, \u003ccode\u003ephonemeBuilder\u003c/code\u003e is replaced with a new builder containing the phonemes\n     * updated by the matching rule.\n     *\n     * Although this class is not thread-safe (it has mutable unprotected fields), it is not shared between threads\n     * as it is constructed as needed by the calling methods.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "finalRules"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phonemeBuilder"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxPhonemes"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.RulesApplication(java.util.Map\u003cjava.lang.String, java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e\u003e, java.lang.CharSequence, org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, int, int)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 183,col 13)",
        "(line 184,col 13)-(line 184,col 41)",
        "(line 185,col 13)-(line 185,col 49)",
        "(line 186,col 13)-(line 186,col 31)",
        "(line 187,col 13)-(line 187,col 23)",
        "(line 188,col 13)-(line 188,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getI()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getPhonemeBuilder()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.invoke()",
      "begin_line": 206,
      "end_line": 228,
      "comment": "\n         * Invokes the rules. Loops over the rules list, stopping at the first one that has a matching context\n         * and pattern. Then applies this rule to the phoneme builder to produce updated phonemes. If there was no\n         * match, \u003ccode\u003ei\u003c/code\u003e is advanced one and the character is silently dropped from the phonetic spelling.\n         *\n         * @return \u003ccode\u003ethis\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 31)",
        "(line 208,col 13)-(line 208,col 34)",
        "(line 209,col 13)-(line 209,col 96)",
        "(line 210,col 13)-(line 220,col 13)",
        "(line 222,col 13)-(line 224,col 13)",
        "(line 226,col 13)-(line 226,col 36)",
        "(line 227,col 13)-(line 227,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.isFound()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NAME_PREFIXES"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.join(java.lang.Iterable\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 257,
      "end_line": 268,
      "comment": "\n     * Joins some strings with an internal separator.\n     * @param strings   Strings to join\n     * @param sep       String to separate them with\n     * @return a single String consisting of each element of \u003ccode\u003estrings\u003c/code\u003e interleaved by \u003ccode\u003esep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 53)",
        "(line 259,col 9)-(line 259,col 55)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_PHONEMES"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lang"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameType"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ruleType"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxPhonemes"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhoneticEngine(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, boolean)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Generates a new, fully-configured phonetic engine.\n     *\n     * @param nameType\n     *            the type of names it will use\n     * @param ruleType\n     *            the type of rules it will apply\n     * @param concat\n     *            if it will concatenate multiple encodings\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhoneticEngine(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, boolean, int)",
      "begin_line": 309,
      "end_line": 319,
      "comment": "\n     * Generates a new, fully-configured phonetic engine.\n     *\n     * @param nameType\n     *            the type of names it will use\n     * @param ruleType\n     *            the type of rules it will apply\n     * @param concat\n     *            if it will concatenate multiple encodings\n     * @param maxPhonemes\n     *            the maximum number of phonemes that will be handled\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 317,col 44)",
        "(line 318,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, java.util.Map\u003cjava.lang.String, java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e\u003e)",
      "begin_line": 329,
      "end_line": 362,
      "comment": "\n     * Applies the final rules to convert from a language-specific phonetic representation to a\n     * language-independent representation.\n     *\n     * @param phonemeBuilder the current phonemes\n     * @param finalRules the final rules to apply\n     * @return the resulting phonemes\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 94)",
        "(line 340,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\n     * Encodes a string to its phonetic representation.\n     *\n     * @param input\n     *            the String to encode\n     * @return the encoding of the input\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 82)",
        "(line 373,col 9)-(line 373,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 385,
      "end_line": 469,
      "comment": "\n     * Encodes an input string into an output phonetic representation, given a set of possible origin languages.\n     *\n     * @param input\n     *            String to phoneticise; a String with dashes or spaces separating each word\n     * @param languageSet\n     * @return a phonetic representation of the input; a String containing \u0027-\u0027-separated phonetic representations\n     *   of the input\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 110)",
        "(line 388,col 9)-(line 388,col 112)",
        "(line 390,col 9)-(line 390,col 115)",
        "(line 394,col 9)-(line 394,col 75)",
        "(line 396,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 70)",
        "(line 414,col 9)-(line 414,col 60)",
        "(line 417,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 74)",
        "(line 456,col 9)-(line 461,col 9)",
        "(line 464,col 9)-(line 464,col 70)",
        "(line 466,col 9)-(line 466,col 70)",
        "(line 468,col 9)-(line 468,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getLang()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * Gets the Lang language guessing rules being used.\n     *\n     * @return the Lang in use\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getNameType()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Gets the NameType being used.\n     *\n     * @return the NameType in use\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getRuleType()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Gets the RuleType being used.\n     *\n     * @return the RuleType in use\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.isConcat()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Gets if multiple phonetic encodings are concatenated or if just the first one is kept.\n     *\n     * @return true if multiple phonetic encodings are returned, false if just the first is\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getMaxPhonemes()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Gets the maximum number of phonemes the engine will calculate for a given input.\n     *\n     * @return the maximum number of phonemes\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 32)"
      ]
    }
  ]
}