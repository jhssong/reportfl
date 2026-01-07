{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhoneticEngine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 552,
      "comment": "\n * \u003cp\u003e\n * Converts words into potential phonetic representations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This is a two-stage process. Firstly, the word is converted into a phonetic representation that takes into account the likely source\n * language. Next, this phonetic representation is converted into a pan-european \u0027average\u0027 representation, allowing comparison between\n * different versions of essentially the same word from different languages.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is intentionally immutable. If you wish to alter the settings for a PhoneticEngine, you must make a new one with the updated\n * settings. This makes the class thread-safe.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Ported from phoneticengine.php\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.6\n "
    },
    {
      "type": "class_interface",
      "name": "PhonemeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 158,
      "comment": "\n     * Utility for manipulating a set of phonemes as they are being built up. Not intended for use outside this package,\n     * and probably not outside the {@link PhoneticEngine} class.\n     *\n     * @author Apache Software Foundation\n     * @since 1.6\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.empty(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n         * An empty builder where all phonemes must come from some set of languages. This will contain a single\n         * phoneme of zero characters. This can then be appended to. This should be the only way to create a new\n         * phoneme from scratch.\n         *\n         * @param languages the set of languages\n         * @return  a new, empty phoneme builder\n         ",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "phonemes"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.PhonemeBuilder(java.util.Set\u003corg.apache.commons.codec.language.bm.Rule.Phoneme\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.append(java.lang.CharSequence)",
      "begin_line": 88,
      "end_line": 96,
      "comment": "\n         * Creates a new phoneme builder containing all phonemes in this one extended by \u003ccode\u003estr\u003c/code\u003e.\n         *\n         * @param str   the characters to append to the phonemes\n         * @return  a new phoneme builder lenghtened by \u003ccode\u003estr\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 78)",
        "(line 91,col 13)-(line 93,col 13)",
        "(line 95,col 13)-(line 95,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.apply(org.apache.commons.codec.language.bm.Rule.PhonemeExpr, int)",
      "begin_line": 109,
      "end_line": 126,
      "comment": "\n         * Creates a new phoneme builder containing the application of the expression to all phonemes in this builder.\n         *\n         * This will lengthen phonemes that have compatible language sets to the expression, and drop those that are\n         * incompatible.\n         *\n         * @param phonemeExpr   the expression to apply\n         * @param maxPhonemes   the maximum number of phonemes to build up\n         * @return  a new phoneme builder containing the results of \u003ccode\u003ephonemeExpr\u003c/code\u003e applied to each phoneme\n         *      in turn\n         ",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 78)",
        "(line 112,col 13)-(line 123,col 13)",
        "(line 125,col 13)-(line 125,col 51)"
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
      "end_line": 157,
      "comment": "\n         * Stringifies the phoneme set. This produces a single string of the strings of each phoneme, joined with a pipe.\n         * This is explicitly provied in place of toString as it is a potentially expensive operation, which should be\n         * avoided when debugging.\n         *\n         * @return  the stringified phoneme set\n         ",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 51)",
        "(line 149,col 13)-(line 154,col 13)",
        "(line 156,col 13)-(line 156,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RulesApplication",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 236,
      "comment": "\n     * A function closure capturing the application of a list of rules to an input sequence at a particular offset.\n     * After invocation, the values \u003ccode\u003ei\u003c/code\u003e and \u003ccode\u003efound\u003c/code\u003e are updated. \u003ccode\u003ei\u003c/code\u003e points to the\n     * index of the next char in \u003ccode\u003einput\u003c/code\u003e that must be processed next (the input up to that index having been\n     * processed already), and \u003ccode\u003efound\u003c/code\u003e indicates if a matching rule was found or not. In the case where a\n     * matching rule was found, \u003ccode\u003ephonemeBuilder\u003c/code\u003e is replaced with a new buidler containing the phonemes\n     * updated by the matching rule.\n     *\n     * @author Apache Software Foundation\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "finalRules"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phonemeBuilder"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxPhonemes"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.RulesApplication(java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e, java.lang.CharSequence, org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, int, int)",
      "begin_line": 180,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 184,col 13)",
        "(line 185,col 13)-(line 185,col 41)",
        "(line 186,col 13)-(line 186,col 49)",
        "(line 187,col 13)-(line 187,col 31)",
        "(line 188,col 13)-(line 188,col 23)",
        "(line 189,col 13)-(line 189,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getI()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getPhonemeBuilder()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.invoke()",
      "begin_line": 207,
      "end_line": 231,
      "comment": "\n         * Invokes the rules. Loops over the rules list, stopping at the first one that has a matching context\n         * and pattern. Then applies this rule to the phoneme builder to produce updated phonemes. If there was no\n         * match, \u003ccode\u003ei\u003c/code\u003e is advanced one and the character is silently dropped from the phonetic spelling.\n         *\n         * @return \u003ccode\u003ethis\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 31)",
        "(line 209,col 13)-(line 209,col 34)",
        "(line 210,col 13)-(line 223,col 13)",
        "(line 225,col 13)-(line 227,col 13)",
        "(line 229,col 13)-(line 229,col 36)",
        "(line 230,col 13)-(line 230,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.isFound()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NAME_PREFIXES"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.cacheSubSequence(java.lang.CharSequence)",
      "begin_line": 255,
      "end_line": 280,
      "comment": "\n     * This is a performance hack to avoid overhead associated with very frequent CharSequence.subSequence calls.\n     *\n     * @param cached the character sequence to cache\n     * @return a \u003ccode\u003eCharSequence\u003c/code\u003e that internally memoises subSequence values\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 90)",
        "(line 258,col 9)-(line 279,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-2440b6bb-5824-4902-82e0-dd27cb056bcd.charAt(int)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 17)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-cab1576d-3a1a-40c7-a510-4560376d3284.length()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 17)-(line 264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-e38aba05-dfbd-4ffc-bf44-354e9f93f85c.subSequence(int, int)",
      "begin_line": 267,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 268,col 17)-(line 270,col 17)",
        "(line 272,col 17)-(line 272,col 57)",
        "(line 273,col 17)-(line 276,col 17)",
        "(line 277,col 17)-(line 277,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.join(java.lang.Iterable\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 288,
      "end_line": 299,
      "comment": "\n     * Joins some strings with an internal separator.\n     * @param strings   Strings to join\n     * @param sep       String to separate them with\n     * @return          a single String consisting of each element of \u003ccode\u003estrings\u003c/code\u003e interlieved by \u003ccode\u003esep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 47)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_PHONEMES"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lang"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameType"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ruleType"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxPhonemes"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhoneticEngine(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, boolean)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Generates a new, fully-configured phonetic engine.\n     *\n     * @param nameType\n     *            the type of names it will use\n     * @param ruleType\n     *            the type of rules it will apply\n     * @param concat\n     *            if it will concatenate multiple encodings\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhoneticEngine(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, boolean, int)",
      "begin_line": 339,
      "end_line": 348,
      "comment": "\n     * Generates a new, fully-configured phonetic engine.\n     *\n     * @param nameType\n     *            the type of names it will use\n     * @param ruleType\n     *            the type of rules it will apply\n     * @param concat\n     *            if it will concatenate multiple encodings\n     * @param maxPhonemes\n     *            the maximum number of phonemes that will be handled\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 33)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 44)",
        "(line 347,col 9)-(line 347,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e)",
      "begin_line": 358,
      "end_line": 395,
      "comment": "\n     * Applies the final rules to convert from a language-specific phonetic representation to a language-independent\n     * representation.\n     *\n     * @param phonemeBuilder\n     * @param finalRules\n     * @return\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 88)",
        "(line 368,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n     * Encodes a string to its phonetic representation.\n     * \n     * @param input\n     *            the String to encode\n     * @return the encoding of the input\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 76)",
        "(line 406,col 9)-(line 406,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 417,
      "end_line": 506,
      "comment": "\n     * Encodes an input string into an output phonetic representation, given a set of possible origin languages.\n     * \n     * @param input\n     *            String to phoneticise; a String with dashes or spaces separating each word\n     * @param languageSet\n     * @return a phonetic representation of the input; a String containing \u0027-\u0027-separated phonetic representations of the input\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 94)",
        "(line 420,col 9)-(line 420,col 96)",
        "(line 422,col 9)-(line 422,col 99)",
        "(line 429,col 9)-(line 429,col 75)",
        "(line 431,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 70)",
        "(line 449,col 9)-(line 449,col 60)",
        "(line 452,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 74)",
        "(line 491,col 9)-(line 491,col 58)",
        "(line 492,col 9)-(line 498,col 9)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 503,col 9)-(line 503,col 70)",
        "(line 505,col 9)-(line 505,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getLang()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Gets the Lang language guessing rules being used.\n     * \n     * @return the Lang in use\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getNameType()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Gets the NameType being used.\n     * \n     * @return the NameType in use\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getRuleType()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Gets the RuleType being used.\n     * \n     * @return the RuleType in use\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.isConcat()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Gets if multiple phonetic encodings are concatenated or if just the first one is kept.\n     * \n     * @return true if multiple phonetic encodings are returned, false if just the first is.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getMaxPhonemes()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\n     * Gets the maximum number of phonemes the engine will calculate for a given input.\n     *\n     * @return the maximum number of phonemes\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 32)"
      ]
    }
  ]
}