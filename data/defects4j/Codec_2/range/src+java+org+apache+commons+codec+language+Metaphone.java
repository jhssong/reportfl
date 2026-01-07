{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/language/Metaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Metaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 43,
      "end_line": 406,
      "comment": "\n * Encodes a string into a metaphone value. \n * \u003cp\u003e\n * Initial Java implementation by \u003cCITE\u003eWilliam B. Brogden. December, 1997\u003c/CITE\u003e. \n * Permission given by \u003cCITE\u003ewbrogden\u003c/CITE\u003e for code to be used anywhere.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cCITE\u003eHanging on the Metaphone\u003c/CITE\u003e by \u003cCITE\u003eLawrence Philips\u003c/CITE\u003e in \u003cCITE\u003eComputer Language of Dec. 1990, p\n * 39.\u003c/CITE\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note, that this does not match the algorithm that ships with PHP, or the algorithm \n * found in the Perl \u003ca href\u003d\"http://search.cpan.org/~mschwern/Text-Metaphone-1.96/Metaphone.pm\"\u003eText:Metaphone-1.96\u003c/a\u003e.\n * They have had undocumented changes from the originally published algorithm. \n * For more information, see \u003ca href\u003d\"https://issues.apache.org/jira/browse/CODEC-57\"\u003eCODEC-57\u003c/a\u003e.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Five values in the English language \n     "
    },
    {
      "type": "field",
      "varNames": [
        "FRONTV"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VARSON"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * The max code length for metaphone is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Metaphone.Metaphone()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Creates an instance of the Metaphone encoder\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.metaphone(java.lang.String)",
      "begin_line": 82,
      "end_line": 314,
      "comment": "\n     * Find the metaphone value of a String. This is similar to the\n     * soundex algorithm, but better at finding similar sounding words.\n     * All input is converted to upper case.\n     * Limitations: Input format is expected to be a single ASCII word\n     * with only characters in the A - Z range, no punctuation or numbers.\n     *\n     * @param txt String to find the metaphone code for\n     * @return A metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 79)",
        "(line 94,col 9)-(line 94,col 50)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 97,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 19)",
        "(line 137,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isVowel(java.lang.StringBuffer, int)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isPreviousChar(java.lang.StringBuffer, int, char)",
      "begin_line": 320,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isNextChar(java.lang.StringBuffer, int, char)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 32)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.regionMatch(java.lang.StringBuffer, int, java.lang.String)",
      "begin_line": 338,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 32)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isLastChar(int, int)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.Object)",
      "begin_line": 365,
      "end_line": 370,
      "comment": "\n     * Encodes an Object using the metaphone algorithm.  This method\n     * is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the\n     * supplied object is not of type java.lang.String.\n     *\n     * @param pObject Object to encode\n     * @return An object (or type java.lang.String) containing the \n     *         metaphone code which corresponds to the String supplied.\n     * @throws EncoderException if the parameter supplied is not\n     *                          of type java.lang.String\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.String)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Encodes a String using the Metaphone algorithm. \n     *\n     * @param pString String object to encode\n     * @return The metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Tests is the metaphones of two strings are identical.\n     *\n     * @param str1 First of two strings to compare\n     * @param str2 Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the metaphones of these strings are identical, \n     *        \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.getMaxCodeLen()",
      "begin_line": 398,
      "end_line": 398,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 398,col 34)-(line 398,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.setMaxCodeLen(int)",
      "begin_line": 404,
      "end_line": 404,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 404,col 49)-(line 404,col 77)"
      ]
    }
  ]
}