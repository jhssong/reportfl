{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/Soundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Soundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 32,
      "end_line": 254,
      "comment": "\n * Encodes a string into a Soundex value. Soundex is an encoding used to relate similar names, but can also be used as a\n * general purpose scheme to find word with similar phonemes.\n *\n * This class is thread-safe.\n * Although not strictly immutable, the {@link #maxLength} field is not actually used.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING_STRING"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * This is a default mapping of the 26 letters used in US English. A value of \u003ccode\u003e0\u003c/code\u003e for a letter position\n     * means do not encode.\n     * \u003cp\u003e\n     * (This constant is provided as both an implementation convenience and to allow Javadoc to pick\n     * up the value for the constant values page.)\n     * \u003c/p\u003e\n     *\n     * @see #US_ENGLISH_MAPPING\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * This is a default mapping of the 26 letters used in US English. A value of \u003ccode\u003e0\u003c/code\u003e for a letter position\n     * means do not encode.\n     *\n     * @see Soundex#Soundex(char[])\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * An instance of Soundex using the US_ENGLISH_MAPPING mapping.\n     *\n     * @see #US_ENGLISH_MAPPING\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": "\n     * The maximum length of a Soundex code - Soundex codes are only four characters by definition.\n     *\n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "soundexMapping"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char array holds the values to which each\n     * letter is mapped. This implementation contains a default map for US_ENGLISH\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Creates an instance using US_ENGLISH_MAPPING\n     *\n     * @see Soundex#Soundex(char[])\n     * @see Soundex#US_ENGLISH_MAPPING\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex(char[])",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Creates a soundex instance using the given mapping. This constructor can be used to provide an internationalized\n     * mapping for a non-Western character set.\n     *\n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char array holds the values to which each\n     * letter is mapped. This implementation contains a default map for US_ENGLISH\n     *\n     * @param mapping\n     *                  Mapping array to use when finding the corresponding code for a given character\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 55)",
        "(line 97,col 9)-(line 97,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Creates a refined soundex instance using a custom mapping. This constructor can be used to customize the mapping,\n     * and/or possibly provide an internationalized mapping for a non-Western character set.\n     *\n     * @param mapping\n     *            Mapping string to use when finding the corresponding code for a given character\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.difference(java.lang.String, java.lang.String)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Encodes the Strings and returns the number of characters in the two encoded Strings that are the same. This\n     * return value ranges from 0 through 4: 0 indicates little or no similarity, and 4 indicates strong similarity or\n     * identical values.\n     *\n     * @param s1\n     *                  A String that will be encoded and compared.\n     * @param s2\n     *                  A String that will be encoded and compared.\n     * @return The number of characters in the two encoded Strings that are the same from 0 to 4.\n     *\n     * @see SoundexUtils#difference(StringEncoder,String,String)\n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e MS\n     *          T-SQL DIFFERENCE \u003c/a\u003e\n     *\n     * @throws EncoderException\n     *                  if an error occurs encoding one of the strings\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.Object)",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * Encodes an Object using the soundex algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type java.lang.String.\n     *\n     * @param obj\n     *                  Object to encode\n     * @return An object (or type java.lang.String) containing the soundex code which corresponds to the String\n     *             supplied.\n     * @throws EncoderException\n     *                  if the parameter supplied is not of type java.lang.String\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.String)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Encodes a String using the soundex algorithm.\n     *\n     * @param str\n     *                  A String object to encode\n     * @return A Soundex code corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getMaxLength()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Returns the maxLength. Standard Soundex\n     *\n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @return int\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getSoundexMapping()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns the soundex mapping.\n     *\n     * @return soundexMapping.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.map(char)",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Maps the given upper-case character to its Soundex code.\n     *\n     * @param ch\n     *                  An upper-case character.\n     * @return A Soundex code.\n     * @throws IllegalArgumentException\n     *                  Thrown if \u003ccode\u003ech\u003c/code\u003e is not mapped.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 35)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.setMaxLength(int)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Sets the maxLength.\n     *\n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @param maxLength\n     *                  The maxLength to set\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.soundex(java.lang.String)",
      "begin_line": 228,
      "end_line": 252,
      "comment": "\n     * Retrieves the Soundex code for a given String object.\n     *\n     * @param str\n     *                  String to encode using the Soundex algorithm\n     * @return A soundex code for the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 38)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 239,col 31)",
        "(line 241,col 9)-(line 241,col 39)",
        "(line 242,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 31)"
      ]
    }
  ]
}