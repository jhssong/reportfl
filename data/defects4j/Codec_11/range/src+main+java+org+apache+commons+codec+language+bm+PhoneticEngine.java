{
  "filepath": "/tmp/Codec-11b/src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhoneticEngine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 511,
      "comment": "\n * \u003cp\u003e\n * Converts words into potential phonetic representations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This is a two-stage process. Firstly, the word is converted into a phonetic representation that takes into account the likely source\n * language. Next, this phonetic representation is converted into a pan-european \u0027average\u0027 representation, allowing comparison between\n * different versions of essentially the same word from different languages.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is intentionally immutable. If you wish to alter the settings for a PhoneticEngine, you must make a new one with the updated\n * settings. This makes the class thread-safe.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Ported from phoneticengine.php\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.6\n "
    },
    {
      "type": "class_interface",
      "name": "PhonemeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 152,
      "comment": "\n     * Utility for manipulating a set of phonemes as they are being built up. Not intended for use outside this package,\n     * and probably not outside the {@link PhoneticEngine} class.\n     *\n     * @author Apache Software Foundation\n     * @since 1.6\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.empty(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n         * An empty builder where all phonemes must come from some set of languages. This will contain a single\n         * phoneme of zero characters. This can then be appended to. This should be the only way to create a new\n         * phoneme from scratch.\n         *\n         * @param languages the set of languages\n         * @return  a new, empty phoneme builder\n         ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 94)"
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
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.PhonemeBuilder(java.util.Set\u003corg.apache.commons.codec.language.bm.Rule.Phoneme\u003e)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.append(java.lang.CharSequence)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "\n         * Creates a new phoneme builder containing all phonemes in this one extended by \u003ccode\u003estr\u003c/code\u003e.\n         *\n         * @param str   the characters to append to the phonemes\n         * @return  a new phoneme builder lenghened by \u003ccode\u003estr\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 72)",
        "(line 90,col 13)-(line 92,col 13)",
        "(line 94,col 13)-(line 94,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.apply(org.apache.commons.codec.language.bm.Rule.PhonemeExpr)",
      "begin_line": 107,
      "end_line": 120,
      "comment": "\n         * Creates a new phoneme builder containing the application of the expression to all phonemes in this builder.\n         *\n         * This will lengthen phonemes that have compatible language sets to the expression, and drop those that are\n         * incompatible.\n         *\n         * @param phonemeExpr   the expression to apply\n         * @return  a new phoneme builder containing the results of \u003ccode\u003ephonemeExpr\u003c/code\u003e applied to each phoneme\n         *      in turn\n         ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 72)",
        "(line 110,col 13)-(line 117,col 13)",
        "(line 119,col 13)-(line 119,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.getPhonemes()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n         * Gets underlying phoneme set. Please don\u0027t mutate.\n         *\n         * @return  the phoneme set\n         ",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.makeString()",
      "begin_line": 138,
      "end_line": 151,
      "comment": "\n         * Stringifies the phoneme set. This produces a single string of the strings of each phoneme, joined with a pipe.\n         * This is explicitly provied in place of toString as it is a potentially expensive operation, which should be\n         * avoided when debugging.\n         *\n         * @return  the stringified phoneme set\n         ",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 51)",
        "(line 143,col 13)-(line 148,col 13)",
        "(line 150,col 13)-(line 150,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RulesApplication",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 165,
      "end_line": 227,
      "comment": "\n     * A function closure capturing the application of a list of rules to an input sequence at a particular offset.\n     * After invocation, the values \u003ccode\u003ei\u003c/code\u003e and \u003ccode\u003efound\u003c/code\u003e are updated. \u003ccode\u003ei\u003c/code\u003e points to the\n     * index of the next char in \u003ccode\u003einput\u003c/code\u003e that must be processed next (the input up to that index having been\n     * processed already), and \u003ccode\u003efound\u003c/code\u003e indicates if a matching rule was found or not. In the case where a\n     * matching rule was found, \u003ccode\u003ephonemeBuilder\u003c/code\u003e is replaced with a new buidler containing the phonemes\n     * updated by the matching rule.\n     *\n     * @author Apache Software Foundation\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "finalRules"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phonemeBuilder"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.RulesApplication(java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e, java.lang.CharSequence, org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, int)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 176,col 13)",
        "(line 177,col 13)-(line 177,col 41)",
        "(line 178,col 13)-(line 178,col 49)",
        "(line 179,col 13)-(line 179,col 31)",
        "(line 180,col 13)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getI()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.getPhonemeBuilder()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.invoke()",
      "begin_line": 198,
      "end_line": 222,
      "comment": "\n         * Invokes the rules. Loops over the rules list, stopping at the first one that has a matching context\n         * and pattern. Then applies this rule to the phoneme builder to produce updated phonemes. If there was no\n         * match, \u003ccode\u003ei\u003c/code\u003e is advanced one and the character is silently dropped from the phonetic spelling.\n         *\n         * @return \u003ccode\u003ethis\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 31)",
        "(line 200,col 13)-(line 200,col 34)",
        "(line 201,col 13)-(line 214,col 13)",
        "(line 216,col 13)-(line 218,col 13)",
        "(line 220,col 13)-(line 220,col 36)",
        "(line 221,col 13)-(line 221,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication.isFound()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NAME_PREFIXES"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.cacheSubSequence(java.lang.CharSequence)",
      "begin_line": 246,
      "end_line": 271,
      "comment": "\n     * This is a performance hack to avoid overhead associated with very frequent CharSequence.subSequence calls.\n     *\n     * @param cached the character sequence to cache\n     * @return a \u003ccode\u003eCharSequence\u003c/code\u003e that internally memoises subSequence values\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 90)",
        "(line 249,col 9)-(line 270,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-1de072bc-8f58-4f72-92bf-e8e631b36f8a.charAt(int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 17)-(line 251,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-dcaaef62-5b26-443d-b222-e5277e8984a2.length()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 17)-(line 255,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.Anonymous-2106cfc9-de23-435e-a5d1-99e8042feff3.subSequence(int, int)",
      "begin_line": 258,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 259,col 17)-(line 261,col 17)",
        "(line 263,col 17)-(line 263,col 57)",
        "(line 264,col 17)-(line 267,col 17)",
        "(line 268,col 17)-(line 268,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.join(java.lang.Iterable\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 279,
      "end_line": 290,
      "comment": "\n     * Joins some strings with an internal separator.\n     * @param strings   Strings to join\n     * @param sep       String to separate them with\n     * @return          a single String consisting of each element of \u003ccode\u003estrings\u003c/code\u003e interlieved by \u003ccode\u003esep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 47)",
        "(line 281,col 9)-(line 281,col 49)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lang"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameType"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ruleType"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.PhoneticEngine(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, boolean)",
      "begin_line": 310,
      "end_line": 318,
      "comment": "\n     * Generates a new, fully-configured phonetic engine.\n     * \n     * @param nameType\n     *            the type of names it will use\n     * @param ruleType\n     *            the type of rules it will apply\n     * @param concat\n     *            if it will concatenate multiple encodings\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 317,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder, java.util.List\u003corg.apache.commons.codec.language.bm.Rule\u003e)",
      "begin_line": 328,
      "end_line": 364,
      "comment": "\n     * Applies the final rules to convert from a language-specific phonetic representation to a language-independent\n     * representation.\n     *\n     * @param phonemeBuilder\n     * @param finalRules\n     * @return\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 88)",
        "(line 338,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\n     * Encodes a string to its phonetic representation.\n     * \n     * @param input\n     *            the String to encode\n     * @return the encoding of the input\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 76)",
        "(line 375,col 9)-(line 375,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.encode(java.lang.String, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 386,
      "end_line": 474,
      "comment": "\n     * Encodes an input string into an output phonetic representation, given a set of possible origin languages.\n     * \n     * @param input\n     *            String to phoneticise; a String with dashes or spaces separating each word\n     * @param languageSet\n     * @return a phonetic representation of the input; a String containing \u0027-\u0027-separated phonetic representations of the input\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 94)",
        "(line 389,col 9)-(line 389,col 96)",
        "(line 391,col 9)-(line 391,col 99)",
        "(line 398,col 9)-(line 398,col 75)",
        "(line 400,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 70)",
        "(line 418,col 9)-(line 418,col 60)",
        "(line 421,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 74)",
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 469,col 9)-(line 469,col 70)",
        "(line 471,col 9)-(line 471,col 70)",
        "(line 473,col 9)-(line 473,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getLang()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Gets the Lang language guessing rules being used.\n     * \n     * @return the Lang in use\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getNameType()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * Gets the NameType being used.\n     * \n     * @return the NameType in use\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.getRuleType()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Gets the RuleType being used.\n     * \n     * @return the RuleType in use\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.PhoneticEngine.isConcat()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Gets if multiple phonetic encodings are concatenated or if just the first one is kept.\n     * \n     * @return true if multiple phonetic encodings are returned, false if just the first is.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 27)"
      ]
    }
  ]
}