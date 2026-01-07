{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/language/Metaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Metaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 42,
      "end_line": 405,
      "comment": "\n * Encodes a string into a metaphone value. \n * \u003cp\u003e\n * Initial Java implementation by \u003cCITE\u003eWilliam B. Brogden. December, 1997\u003c/CITE\u003e. \n * Permission given by \u003cCITE\u003ewbrogden\u003c/CITE\u003e for code to be used anywhere.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cCITE\u003eHanging on the Metaphone\u003c/CITE\u003e by \u003cCITE\u003eLawrence Philips\u003c/CITE\u003e in \u003cCITE\u003eComputer Language of Dec. 1990, p\n * 39.\u003c/CITE\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note, that this does not match the algorithm that ships with PHP, or the algorithm \n * found in the Perl \u003ca href\u003d\"http://search.cpan.org/~mschwern/Text-Metaphone-1.96/Metaphone.pm\"\u003eText:Metaphone-1.96\u003c/a\u003e.\n * They have had undocumented changes from the originally published algorithm. \n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Five values in the English language \n     "
    },
    {
      "type": "field",
      "varNames": [
        "FRONTV"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VARSON"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The max code length for metaphone is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Metaphone.Metaphone()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Creates an instance of the Metaphone encoder\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.metaphone(java.lang.String)",
      "begin_line": 81,
      "end_line": 313,
      "comment": "\n     * Find the metaphone value of a String. This is similar to the\n     * soundex algorithm, but better at finding similar sounding words.\n     * All input is converted to upper case.\n     * Limitations: Input format is expected to be a single ASCII word\n     * with only characters in the A - Z range, no punctuation or numbers.\n     *\n     * @param txt String to find the metaphone code for\n     * @return A metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 79)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 94,col 9)-(line 94,col 50)",
        "(line 96,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 19)",
        "(line 136,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isVowel(java.lang.StringBuffer, int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 3)-(line 316,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isPreviousChar(java.lang.StringBuffer, int, char)",
      "begin_line": 319,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 320,col 3)-(line 320,col 26)",
        "(line 321,col 3)-(line 324,col 3)",
        "(line 325,col 3)-(line 325,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isNextChar(java.lang.StringBuffer, int, char)",
      "begin_line": 328,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 329,col 3)-(line 329,col 26)",
        "(line 330,col 3)-(line 333,col 3)",
        "(line 334,col 3)-(line 334,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.regionMatch(java.lang.StringBuffer, int, java.lang.String)",
      "begin_line": 337,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 338,col 3)-(line 338,col 26)",
        "(line 339,col 3)-(line 343,col 3)",
        "(line 344,col 3)-(line 344,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isLastChar(int, int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 3)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.Object)",
      "begin_line": 364,
      "end_line": 369,
      "comment": "\n     * Encodes an Object using the metaphone algorithm.  This method\n     * is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the\n     * supplied object is not of type java.lang.String.\n     *\n     * @param pObject Object to encode\n     * @return An object (or type java.lang.String) containing the \n     *         metaphone code which corresponds to the String supplied.\n     * @throws EncoderException if the parameter supplied is not\n     *                          of type java.lang.String\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.String)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Encodes a String using the Metaphone algorithm. \n     *\n     * @param pString String object to encode\n     * @return The metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Tests is the metaphones of two strings are identical.\n     *\n     * @param str1 First of two strings to compare\n     * @param str2 Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the metaphones of these strings are identical, \n     *        \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.getMaxCodeLen()",
      "begin_line": 397,
      "end_line": 397,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 397,col 34)-(line 397,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.setMaxCodeLen(int)",
      "begin_line": 403,
      "end_line": 403,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 403,col 49)-(line 403,col 77)"
      ]
    }
  ]
}