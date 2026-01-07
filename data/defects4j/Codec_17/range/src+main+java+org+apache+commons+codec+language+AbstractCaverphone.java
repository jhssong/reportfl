{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/AbstractCaverphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCaverphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 35,
      "end_line": 80,
      "comment": "\n * Encodes a string into a Caverphone value.\n *\n * This is an algorithm created by the Caversham Project at the University of Otago. It implements the Caverphone 2.0\n * algorithm:\n *\n * \u003cp\u003eThis class is immutable and thread-safe.\u003c/p\u003e\n *\n * @version $Id: Caverphone.java 1075947 2011-03-01 17:56:14Z ggregory $\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Caverphone\"\u003eWikipedia - Caverphone\u003c/a\u003e\n * @since 1.5\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.AbstractCaverphone.AbstractCaverphone()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates an instance of the Caverphone encoder\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.AbstractCaverphone.encode(java.lang.Object)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Encodes an Object using the caverphone algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type java.lang.String.\n     *\n     * @param source\n     *            Object to encode\n     * @return An object (or type java.lang.String) containing the caverphone code which corresponds to the String\n     *         supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type java.lang.String\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.AbstractCaverphone.isEncodeEqual(java.lang.String, java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Tests if the encodings of two strings are equal.\n     *\n     * This method might be promoted to a new AbstractStringEncoder superclass.\n     *\n     * @param str1\n     *            First of two strings to compare\n     * @param str2\n     *            Second of two strings to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encodings of these strings are identical, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @throws EncoderException\n     *             thrown if there is an error condition during the encoding process.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 59)"
      ]
    }
  ]
}