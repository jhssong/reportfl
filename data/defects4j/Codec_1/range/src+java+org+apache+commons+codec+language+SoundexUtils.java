{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/language/SoundexUtils.java",
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
      "comment": "\n\t * Cleans up the input string before Soundex processing by only returning\n\t * upper case letters.\n\t * \n\t * @param str\n\t *                  The String to clean.\n\t * @return A clean String.\n\t ",
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
      "comment": "\n\t * Encodes the Strings and returns the number of characters in the two\n\t * encoded Strings that are the same.\n\t * \u003cul\u003e\n\t * \u003cli\u003eFor Soundex, this return value ranges from 0 through 4: 0 indicates\n\t * little or no similarity, and 4 indicates strong similarity or identical\n\t * values.\u003c/li\u003e\n\t * \u003cli\u003eFor refined Soundex, the return value can be greater than 4.\u003c/li\u003e\n\t * \u003c/ul\u003e\n\t * \n\t * @param encoder\n\t *                  The encoder to use to encode the Strings.\n\t * @param s1\n\t *                  A String that will be encoded and compared.\n\t * @param s2\n\t *                  A String that will be encoded and compared.\n\t * @return The number of characters in the two Soundex encoded Strings that\n\t *             are the same.\n\t * \n\t * @see #differenceEncoded(String,String)\n\t * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n\t *          MS T-SQL DIFFERENCE\u003c/a\u003e\n\t * \n\t * @throws EncoderException\n\t *                  if an error occurs encoding one of the strings\n\t ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.SoundexUtils.differenceEncoded(java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n\t * Returns the number of characters in the two Soundex encoded Strings that\n\t * are the same.\n\t * \u003cul\u003e\n\t * \u003cli\u003eFor Soundex, this return value ranges from 0 through 4: 0 indicates\n\t * little or no similarity, and 4 indicates strong similarity or identical\n\t * values.\u003c/li\u003e\n\t * \u003cli\u003eFor refined Soundex, the return value can be greater than 4.\u003c/li\u003e\n\t * \u003c/ul\u003e\n\t * \n\t * @param es1\n\t *                  An encoded String.\n\t * @param es2\n\t *                  An encoded String.\n\t * @return The number of characters in the two Soundex encoded Strings that\n\t *             are the same.\n\t * \n\t * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n\t *          MS T-SQL DIFFERENCE\u003c/a\u003e\n\t ",
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