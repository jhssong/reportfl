{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/language/bm/Lang.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lang",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 245,
      "comment": "\n * \u003cp\u003e\n * Language guessing utility.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class encapsulates rules used to guess the possible languages that a word originates from. This is done by reference to a whole\n * series of rules distributed in resource files.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Instances of this class are typically managed through the static factory method instance(). Unless you are developing your own language\n * guessing rules, you will not need to interact with this class directly.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is intended to be immutable and thread-safe.\n * \u003c/p\u003e\n * \u003ch2\u003eLang resources\u003c/h2\n * \u003cp\u003e\n * Language guessing rules are typically loaded from resource files. These are UTF-8 encoded text files. They are systematically named\n * following the pattern: \u003cblockquote\u003eorg/apache/commons/codec/language/bm/lang.txt\u003c/blockquote\u003e The format of these resources is the\n * following:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eRules:\u003c/b\u003e whitespace separated strings. There should be 3 columns to each row, and these will be interpreted as:\n * \u003col\u003e\n * \u003cli\u003epattern: a regular expression.\u003c/li\u003e\n * \u003cli\u003elanguages: a \u0027+\u0027-separated list of languages.\u003c/li\u003e\n * \u003cli\u003eacceptOnMatch: \u0027true\u0027 or \u0027false\u0027 indicating if a match rules in or rules out the language.\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurance of \u0027//\u0027 will cause all text following on that line to be discarded as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode. This will skip all content until a\n * line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp/\u003e\n * Port of lang.php\n * \n * @author Apache Software Foundation\n * @since 1.6\n "
    },
    {
      "type": "class_interface",
      "name": "LangRule",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "acceptOnMatch"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Lang.LangRule.LangRule(java.util.regex.Pattern, java.util.Set\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 35)",
        "(line 89,col 13)-(line 89,col 39)",
        "(line 90,col 13)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.LangRule.matches(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "Langs"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANGUAGE_RULES_RN"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.instance(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets a Lang instance for one of the supported NameTypes.\n     * \n     * @param nameType\n     *            the NameType to look up\n     * @return a Lang encapsulating the language guessing rules for that name type\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages)",
      "begin_line": 134,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003e\n     * Loads language rules from a resource.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In normal use, you will obtain instances of Lang through the {@link #instance(NameType)} method. You will only need to call this\n     * yourself if you are developing custom language mapping rules.\n     * \u003c/p\u003e\n     * \n     * @param languageRulesResourceName\n     *            the fully-qualified resource name to load\n     * @param languages\n     *            the languages that these rules will support\n     * @return a Lang encapsulating the loaded language-guessing rules.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 136,col 106)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 76)",
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rules"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Lang.Lang(java.util.List\u003corg.apache.commons.codec.language.bm.Lang.LangRule\u003e, org.apache.commons.codec.language.bm.Languages)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 57)",
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.guessLanguage(java.lang.String)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Guesses the language of a word.\n     * \n     * @param text\n     *            the word\n     * @return the language that the word originates from or {@link Languages#ANY} if there was no unique match\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 56)",
        "(line 211,col 9)-(line 211,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.guessLanguages(java.lang.String)",
      "begin_line": 221,
      "end_line": 244,
      "comment": "\n     * Guesses the languages of a word.\n     * \n     * @param input\n     *            the word\n     * @return a Set of Strings of language names that are potential matches for the input word\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 56)",
        "(line 225,col 9)-(line 225,col 79)",
        "(line 226,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 69)",
        "(line 243,col 9)-(line 243,col 79)"
      ]
    }
  ]
}