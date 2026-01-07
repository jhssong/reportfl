{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/Caverphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Caverphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 35,
      "end_line": 105,
      "comment": "\n * Encodes a string into a Caverphone 2.0 value. Delegate to a {@link Caverphone2} instance.\n *\n * This is an algorithm created by the Caversham Project at the University of Otago. It implements the Caverphone 2.0\n * algorithm:\n *\n * @version $Id: Caverphone.java 1079535 2011-03-08 20:54:37Z ggregory $\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Caverphone\"\u003eWikipedia - Caverphone\u003c/a\u003e\n * @see \u003ca href\u003d\"http://caversham.otago.ac.nz/files/working/ctp150804.pdf\"\u003eCaverphone 2.0 specification\u003c/a\u003e\n * @since 1.4\n * @deprecated 1.5 Replaced by {@link Caverphone2}, will be removed in 2.0.\n "
    },
    {
      "type": "field",
      "varNames": [
        "encoder"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Delegate to a {@link Caverphone2} instance to avoid code duplication.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Caverphone.Caverphone()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Creates an instance of the Caverphone encoder\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.caverphone(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Encodes the given String into a Caverphone value.\n     *\n     * @param source\n     *            String the source string\n     * @return A caverphone code for the given String\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.encode(java.lang.Object)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Encodes an Object using the caverphone algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type java.lang.String.\n     *\n     * @param obj\n     *            Object to encode\n     * @return An object (or type java.lang.String) containing the caverphone code which corresponds to the String\n     *         supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type java.lang.String\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.encode(java.lang.String)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Encodes a String using the Caverphone algorithm.\n     *\n     * @param str\n     *            String object to encode\n     * @return The caverphone code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Caverphone.isCaverphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Tests if the caverphones of two strings are identical.\n     *\n     * @param str1\n     *            First of two strings to compare\n     * @param str2\n     *            Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the caverphones of these strings are identical, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 67)"
      ]
    }
  ]
}