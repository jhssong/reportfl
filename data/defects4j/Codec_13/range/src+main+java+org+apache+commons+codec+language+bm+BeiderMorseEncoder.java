{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/bm/BeiderMorseEncoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeiderMorseEncoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 71,
      "end_line": 176,
      "comment": "\n * Encodes strings into their Beider-Morse phonetic encoding.\n * \u003cp\u003e\n * Beider-Morse phonetic encodings are optimised for family names. However, they may be useful for a wide range\n * of words.\n * \u003cp\u003e\n * This encoder is intentionally mutable to allow dynamic configuration through bean properties. As such, it\n * is mutable, and may not be thread-safe. If you require a guaranteed thread-safe encoding then use\n * {@link PhoneticEngine} directly.\n * \u003cp\u003e\n * \u003cb\u003eEncoding overview\u003c/b\u003e\n * \u003cp\u003e\n * Beider-Morse phonetic encodings is a multi-step process. Firstly, a table of rules is consulted to guess what\n * language the word comes from. For example, if it ends in \"\u003ccode\u003eault\u003c/code\u003e\" then it infers that the word is French.\n * Next, the word is translated into a phonetic representation using a language-specific phonetics table. Some\n * runs of letters can be pronounced in multiple ways, and a single run of letters may be potentially broken up\n * into phonemes at different places, so this stage results in a set of possible language-specific phonetic\n * representations. Lastly, this language-specific phonetic representation is processed by a table of rules that\n * re-writes it phonetically taking into account systematic pronunciation differences between languages, to move\n * it towards a pan-indo-european phonetic representation. Again, sometimes there are multiple ways this could be\n * done and sometimes things that can be pronounced in several ways in the source language have only one way to\n * represent them in this average phonetic language, so the result is again a set of phonetic spellings.\n * \u003cp\u003e\n * Some names are treated as having multiple parts. This can be due to two things. Firstly, they may be hyphenated.\n * In this case, each individual hyphenated word is encoded, and then these are combined end-to-end for the final\n * encoding. Secondly, some names have standard prefixes, for example, \"\u003ccode\u003eMac/Mc\u003c/code\u003e\" in Scottish (English)\n * names. As sometimes it is ambiguous whether the prefix is intended or is an accident of the spelling, the word\n * is encoded once with the prefix and once without it. The resulting encoding contains one and then the other result.\n * \u003cp\u003e\n * \u003cb\u003eEncoding format\u003c/b\u003e\n * \u003cp\u003e\n * Individual phonetic spellings of an input word are represented in upper- and lower-case roman characters. Where\n * there are multiple possible phonetic representations, these are joined with a pipe (\u003ccode\u003e|\u003c/code\u003e) character.\n * If multiple hyphenated words where found, or if the word may contain a name prefix, each encoded word is placed\n * in elipses and these blocks are then joined with hyphens. For example, \"\u003ccode\u003ed\u0027ortley\u003c/code\u003e\" has a possible\n * prefix. The form without prefix encodes to \"\u003ccode\u003eortlaj|ortlej\u003c/code\u003e\", while the form with prefix encodes to\n * \"\u003ccode\u003edortlaj|dortlej\u003c/code\u003e\". Thus, the full, combined encoding is \"{@code (ortlaj|ortlej)-(dortlaj|dortlej)}\".\n * \u003cp\u003e\n * The encoded forms are often quite a bit longer than the input strings. This is because a single input may have many\n * potential phonetic interpretations. For example, \"\u003ccode\u003eRenault\u003c/code\u003e\" encodes to\n * \"\u003ccode\u003erYnDlt|rYnalt|rYnult|rinDlt|rinalt|rinult\u003c/code\u003e\". The \u003ccode\u003eAPPROX\u003c/code\u003e rules will tend to produce larger\n * encodings as they consider a wider range of possible, approximate phonetic interpretations of the original word.\n * Down-stream applications may wish to further process the encoding for indexing or lookup purposes, for example, by\n * splitting on pipe (\u003ccode\u003e|\u003c/code\u003e) and indexing under each of these alternatives.\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "engine"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " a cached object"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.encode(java.lang.Object)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.encode(java.lang.String)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.getNameType()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the name type currently in operation.\n     *\n     * @return the NameType currently being used\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.getRuleType()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Gets the rule type currently in operation.\n     *\n     * @return the RuleType currently being used\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.isConcat()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Discovers if multiple possible encodings are concatenated.\n     *\n     * @return true if multiple encodings are concatenated, false if just the first one is returned\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.setConcat(boolean)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * Sets how multiple possible phonetic encodings are combined.\n     *\n     * @param concat\n     *            true if multiple encodings are to be combined with a \u0027|\u0027, false if just the first one is\n     *            to be considered\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.setNameType(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\n     * Sets the type of name. Use {@link NameType#GENERIC} unless you specifically want phonetic encodings\n     * optimized for Ashkenazi or Sephardic Jewish family names.\n     *\n     * @param nameType\n     *            the NameType in use\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 146,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.setRuleType(org.apache.commons.codec.language.bm.RuleType)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Sets the rule type to apply. This will widen or narrow the range of phonetic encodings considered.\n     *\n     * @param ruleType\n     *            {@link RuleType#APPROX} or {@link RuleType#EXACT} for approximate or exact phonetic matches\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 159,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.BeiderMorseEncoder.setMaxPhonemes(int)",
      "begin_line": 169,
      "end_line": 174,
      "comment": "\n     * Sets the number of maximum of phonemes that shall be considered by the engine.\n     *\n     * @param maxPhonemes\n     *            the maximum number of phonemes returned by the engine\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 173,col 54)"
      ]
    }
  ]
}