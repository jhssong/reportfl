{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/language/SoundexUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SoundexUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 123,
      "comment": "\n * Utility methods for {@link Soundex} and {@link RefinedSoundex} classes.\n * \n * @author Apache Software Foundation\n * @version $Id$\n * @since 1.3\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.SoundexUtils.clean(java.lang.String)",
      "begin_line": 40,
      "end_line": 56,
      "comment": "\n     * Cleans up the input string before Soundex processing by only returning\n     * upper case letters.\n     * \n     * @param str\n     *                  The String to clean.\n     * @return A clean String.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 43,col 9)",
        "(line 44,col 9)-(line 44,col 31)",
        "(line 45,col 9)-(line 45,col 37)",
        "(line 46,col 9)-(line 46,col 22)",
        "(line 47,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.SoundexUtils.difference(org.apache.commons.codec.StringEncoder, java.lang.String, java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Encodes the Strings and returns the number of characters in the two\n     * encoded Strings that are the same.\n     * \u003cul\u003e\n     * \u003cli\u003eFor Soundex, this return value ranges from 0 through 4: 0 indicates\n     * little or no similarity, and 4 indicates strong similarity or identical\n     * values.\u003c/li\u003e\n     * \u003cli\u003eFor refined Soundex, the return value can be greater than 4.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param encoder\n     *                  The encoder to use to encode the Strings.\n     * @param s1\n     *                  A String that will be encoded and compared.\n     * @param s2\n     *                  A String that will be encoded and compared.\n     * @return The number of characters in the two Soundex encoded Strings that\n     *             are the same.\n     * \n     * @see #differenceEncoded(String,String)\n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n     *          MS T-SQL DIFFERENCE\u003c/a\u003e\n     * \n     * @throws EncoderException\n     *                  if an error occurs encoding one of the strings\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.SoundexUtils.differenceEncoded(java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n     * Returns the number of characters in the two Soundex encoded Strings that\n     * are the same.\n     * \u003cul\u003e\n     * \u003cli\u003eFor Soundex, this return value ranges from 0 through 4: 0 indicates\n     * little or no similarity, and 4 indicates strong similarity or identical\n     * values.\u003c/li\u003e\n     * \u003cli\u003eFor refined Soundex, the return value can be greater than 4.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param es1\n     *                  An encoded String.\n     * @param es2\n     *                  An encoded String.\n     * @return The number of characters in the two Soundex encoded Strings that\n     *             are the same.\n     * \n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n     *          MS T-SQL DIFFERENCE\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 114,col 21)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    }
  ]
}