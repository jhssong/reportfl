{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/Metaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Metaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 53,
      "end_line": 430,
      "comment": "\n * Encodes a string into a Metaphone value.\n * \u003cp\u003e\n * Initial Java implementation by \u003cCITE\u003eWilliam B. Brogden. December, 1997\u003c/CITE\u003e.\n * Permission given by \u003cCITE\u003ewbrogden\u003c/CITE\u003e for code to be used anywhere.\n * \u003cp\u003e\n * \u003cCITE\u003eHanging on the Metaphone\u003c/CITE\u003e by \u003cCITE\u003eLawrence Philips\u003c/CITE\u003e in \u003cCITE\u003eComputer Language of Dec. 1990,\n * p 39.\u003c/CITE\u003e\n * \u003cp\u003e\n * Note, that this does not match the algorithm that ships with PHP, or the algorithm found in the Perl implementations:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://search.cpan.org/~mschwern/Text-Metaphone-1.96/Metaphone.pm\"\u003eText:Metaphone-1.96\u003c/a\u003e\n *  (broken link 4/30/2013) \u003c/li\u003e\n * \u003cli\u003e\u003ca href\u003d\"https://metacpan.org/source/MSCHWERN/Text-Metaphone-1.96//Metaphone.pm\"\u003eText:Metaphone-1.96\u003c/a\u003e\n *  (link checked 4/30/2013) \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * They have had undocumented changes from the originally published algorithm.\n * For more information, see \u003ca href\u003d\"https://issues.apache.org/jira/browse/CODEC-57\"\u003eCODEC-57\u003c/a\u003e.\n * \u003cp\u003e\n * This class is conditionally thread-safe.\n * The instance field {@link #maxCodeLen} is mutable {@link #setMaxCodeLen(int)}\n * but is not volatile, and accesses are not synchronized.\n * If an instance of the class is shared between threads, the caller needs to ensure that suitable synchronization\n * is used to ensure safe publication of the value between threads, and must not invoke {@link #setMaxCodeLen(int)}\n * after initial setup.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Five values in the English language\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FRONTV"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VARSON"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Variable used in Metaphone algorithm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The max code length for metaphone is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Metaphone.Metaphone()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Creates an instance of the Metaphone encoder\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.metaphone(java.lang.String)",
      "begin_line": 92,
      "end_line": 336,
      "comment": "\n     * Find the metaphone value of a String. This is similar to the\n     * soundex algorithm, but better at finding similar sounding words.\n     * All input is converted to upper case.\n     * Limitations: Input format is expected to be a single ASCII word\n     * with only characters in the A - Z range, no punctuation or numbers.\n     *\n     * @param txt String to find the metaphone code for\n     * @return A metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)",
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 84)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 106,col 57)",
        "(line 108,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 40)",
        "(line 146,col 9)-(line 146,col 18)",
        "(line 148,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isVowel(java.lang.StringBuilder, int)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isPreviousChar(java.lang.StringBuilder, int, char)",
      "begin_line": 342,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isNextChar(java.lang.StringBuilder, int, char)",
      "begin_line": 351,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 32)",
        "(line 353,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.regionMatch(java.lang.StringBuilder, int, java.lang.String)",
      "begin_line": 360,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 32)",
        "(line 362,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isLastChar(int, int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.Object)",
      "begin_line": 387,
      "end_line": 393,
      "comment": "\n     * Encodes an Object using the metaphone algorithm.  This method\n     * is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the\n     * supplied object is not of type java.lang.String.\n     *\n     * @param obj Object to encode\n     * @return An object (or type java.lang.String) containing the\n     *         metaphone code which corresponds to the String supplied.\n     * @throws EncoderException if the parameter supplied is not\n     *                          of type java.lang.String\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.encode(java.lang.String)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n     * Encodes a String using the Metaphone algorithm.\n     *\n     * @param str String object to encode\n     * @return The metaphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.isMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Tests is the metaphones of two strings are identical.\n     *\n     * @param str1 First of two strings to compare\n     * @param str2 Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the metaphones of these strings are identical,\n     *        \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.getMaxCodeLen()",
      "begin_line": 422,
      "end_line": 422,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 422,col 34)-(line 422,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Metaphone.setMaxCodeLen(int)",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 428,col 55)-(line 428,col 83)"
      ]
    }
  ]
}