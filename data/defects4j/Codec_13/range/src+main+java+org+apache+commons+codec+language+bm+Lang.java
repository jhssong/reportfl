{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/bm/Lang.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lang",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 71,
      "end_line": 231,
      "comment": "\n * Language guessing utility.\n * \u003cp\u003e\n * This class encapsulates rules used to guess the possible languages that a word originates from. This is\n * done by reference to a whole series of rules distributed in resource files.\n * \u003cp\u003e\n * Instances of this class are typically managed through the static factory method instance().\n * Unless you are developing your own language guessing rules, you will not need to interact with this class directly.\n * \u003cp\u003e\n * This class is intended to be immutable and thread-safe.\n * \u003cp\u003e\n * \u003cb\u003eLang resources\u003c/b\u003e\n * \u003cp\u003e\n * Language guessing rules are typically loaded from resource files. These are UTF-8 encoded text files.\n * They are systematically named following the pattern:\n * \u003cblockquote\u003eorg/apache/commons/codec/language/bm/lang.txt\u003c/blockquote\u003e\n * The format of these resources is the following:\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eRules:\u003c/b\u003e whitespace separated strings.\n * There should be 3 columns to each row, and these will be interpreted as:\n * \u003col\u003e\n * \u003cli\u003epattern: a regular expression.\u003c/li\u003e\n * \u003cli\u003elanguages: a \u0027+\u0027-separated list of languages.\u003c/li\u003e\n * \u003cli\u003eacceptOnMatch: \u0027true\u0027 or \u0027false\u0027 indicating if a match rules in or rules out the language.\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurrence of \u0027//\u0027 will cause all text following on that line to be\n * discarded as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode.\n * This will skip all content until a line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Port of lang.php\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "LangRule",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "acceptOnMatch"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Lang.LangRule.LangRule(java.util.regex.Pattern, java.util.Set\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 35)",
        "(line 87,col 13)-(line 87,col 39)",
        "(line 88,col 13)-(line 88,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.LangRule.matches(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "Langs"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANGUAGE_RULES_RN"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.instance(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Gets a Lang instance for one of the supported NameTypes.\n     *\n     * @param nameType\n     *            the NameType to look up\n     * @return a Lang encapsulating the language guessing rules for that name type\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages)",
      "begin_line": 129,
      "end_line": 185,
      "comment": "\n     * Loads language rules from a resource.\n     * \u003cp\u003e\n     * In normal use, you will obtain instances of Lang through the {@link #instance(NameType)} method.\n     * You will only need to call this yourself if you are developing custom language mapping rules.\n     *\n     * @param languageRulesResourceName\n     *            the fully-qualified resource name to load\n     * @param languages\n     *            the languages that these rules will support\n     * @return a Lang encapsulating the loaded language-guessing rules.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 131,col 112)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 82)",
        "(line 138,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rules"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Lang.Lang(java.util.List\u003corg.apache.commons.codec.language.bm.Lang.LangRule\u003e, org.apache.commons.codec.language.bm.Languages)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 57)",
        "(line 192,col 9)-(line 192,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.guessLanguage(java.lang.String)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Guesses the language of a word.\n     *\n     * @param text\n     *            the word\n     * @return the language that the word originates from or {@link Languages#ANY} if there was no unique match\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 62)",
        "(line 204,col 9)-(line 204,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Lang.guessLanguages(java.lang.String)",
      "begin_line": 214,
      "end_line": 230,
      "comment": "\n     * Guesses the languages of a word.\n     *\n     * @param input\n     *            the word\n     * @return a Set of Strings of language names that are potential matches for the input word\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 62)",
        "(line 217,col 9)-(line 217,col 85)",
        "(line 218,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 75)",
        "(line 229,col 9)-(line 229,col 79)"
      ]
    }
  ]
}