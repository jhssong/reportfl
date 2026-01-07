{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/language/Caverphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Caverphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 35,
      "end_line": 183,
      "comment": "\n * Encodes a string into a Caverphone value.\n * \n * This is an algorithm created the Caversham Project at the University of Otago. It implements the Caverphone 2.0\n * algorithm:\n * \n * @author Apache Software Foundation\n * @version $Id$\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Caverphone\"\u003eWikipedia - Caverphone\u003c/a\u003e\n * @see \u003ca href\u003d\"http://caversham.otago.ac.nz/files/working/ctp150804.pdf\"\u003eCaverphone 2.0 specification\u003c/a\u003e\n * @since 1.4\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Caverphone.Caverphone()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates an instance of the Caverphone encoder\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.caverphone(java.lang.String)",
      "begin_line": 50,
      "end_line": 140,
      "comment": "\n     * Find the caverphone value of a String. \n     *\n     * @param txt String to find the caverphone code for\n     * @return A caverphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 59,col 9)-(line 59,col 56)",
        "(line 62,col 9)-(line 62,col 43)",
        "(line 65,col 9)-(line 65,col 39)",
        "(line 68,col 9)-(line 68,col 48)",
        "(line 69,col 9)-(line 69,col 48)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 50)",
        "(line 73,col 9)-(line 73,col 42)",
        "(line 74,col 9)-(line 74,col 42)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 78,col 9)-(line 78,col 41)",
        "(line 79,col 9)-(line 79,col 41)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 81,col 9)-(line 81,col 43)",
        "(line 82,col 9)-(line 82,col 39)",
        "(line 83,col 9)-(line 83,col 39)",
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 39)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 90,col 41)",
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 92,col 41)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 42)",
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 40)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 40)",
        "(line 106,col 9)-(line 106,col 40)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 109,col 40)",
        "(line 110,col 9)-(line 110,col 41)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 40)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 40)",
        "(line 125,col 9)-(line 125,col 39)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 132,col 40)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 139,col 9)-(line 139,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.encode(java.lang.Object)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Encodes an Object using the caverphone algorithm.  This method\n     * is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the\n     * supplied object is not of type java.lang.String.\n     *\n     * @param pObject Object to encode\n     * @return An object (or type java.lang.String) containing the \n     *         caverphone code which corresponds to the String supplied.\n     * @throws EncoderException if the parameter supplied is not\n     *                          of type java.lang.String\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.encode(java.lang.String)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Encodes a String using the Caverphone algorithm. \n     *\n     * @param pString String object to encode\n     * @return The caverphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.isCaverphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Tests if the caverphones of two strings are identical.\n     *\n     * @param str1 First of two strings to compare\n     * @param str2 Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the caverphones of these strings are identical, \n     *        \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 57)"
      ]
    }
  ]
}