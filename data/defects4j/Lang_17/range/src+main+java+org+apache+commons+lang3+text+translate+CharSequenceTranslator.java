{
  "filepath": "/tmp/Lang-17b/src/main/java/org/apache/commons/lang3/text/translate/CharSequenceTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceTranslator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 131,
      "comment": "\n * An API for translating text. \n * Its core use is to escape and unescape text. Because escaping and unescaping \n * is completely contextual, the API does not present two separate signatures.\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Translate a set of codepoints, represented by an int index into a CharSequence, \n     * into another set of codepoints. The number of codepoints consumed must be returned, \n     * and the only IOExceptions thrown must be from interacting with the Writer so that \n     * the top level API may reliable ignore StringWriter IOExceptions. \n     *\n     * @param input CharSequence that is being translated\n     * @param index int representing the current point of translation\n     * @param out Writer to translate the text to\n     * @return int count of codepoints consumed\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence)",
      "begin_line": 53,
      "end_line": 65,
      "comment": "\n     * Helper for non-Writer usage. \n     * @param input CharSequence to be translated\n     * @return String output of translation\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence, java.io.Writer)",
      "begin_line": 75,
      "end_line": 104,
      "comment": "\n     * Translate an input onto a Writer. This is intentionally final as its algorithm is \n     * tightly coupled with the abstract method of this class. \n     *\n     * @param input CharSequence that is being translated\n     * @param out Writer to translate the text to\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 83,col 69)",
        "(line 84,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.with(org.apache.commons.lang3.text.translate.CharSequenceTranslator...)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Helper method to create a merger of this translator with another set of \n     * translators. Useful in customizing the standard functionality.\n     *\n     * @param translators CharSequenceTranslator array of translators to merge with this one\n     * @return CharSequenceTranslator merging this translator with the others\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 95)",
        "(line 115,col 9)-(line 115,col 27)",
        "(line 116,col 9)-(line 116,col 74)",
        "(line 117,col 9)-(line 117,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eReturns an upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e for the given\n     * character.\u003c/p\u003e\n     *\n     * @param codepoint The codepoint to convert.\n     * @return An upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 74)"
      ]
    }
  ]
}