{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/language/Soundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Soundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 30,
      "end_line": 278,
      "comment": "\n * Encodes a string into a Soundex value. Soundex is an encoding used to relate similar names, but can also be used as a\n * general purpose scheme to find word with similar phonemes.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING_STRING"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * This is a default mapping of the 26 letters used in US English. A value of \u003ccode\u003e0\u003c/code\u003e for a letter position\n     * means do not encode.\n     * \u003cp\u003e\n     * (This constant is provided as both an implementation convenience and to allow Javadoc to pick\n     * up the value for the constant values page.)\n     * \u003c/p\u003e\n     * \n     * @see #US_ENGLISH_MAPPING\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * This is a default mapping of the 26 letters used in US English. A value of \u003ccode\u003e0\u003c/code\u003e for a letter position\n     * means do not encode.\n     * \n     * @see Soundex#Soundex(char[])\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * An instance of Soundex using the US_ENGLISH_MAPPING mapping.\n     * \n     * @see #US_ENGLISH_MAPPING\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.difference(java.lang.String, java.lang.String)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Encodes the Strings and returns the number of characters in the two encoded Strings that are the same. This\n     * return value ranges from 0 through 4: 0 indicates little or no similarity, and 4 indicates strong similarity or\n     * identical values.\n     * \n     * @param s1\n     *                  A String that will be encoded and compared.\n     * @param s2\n     *                  A String that will be encoded and compared.\n     * @return The number of characters in the two encoded Strings that are the same from 0 to 4.\n     * \n     * @see SoundexUtils#difference(StringEncoder,String,String)\n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e MS\n     *          T-SQL DIFFERENCE \u003c/a\u003e\n     * \n     * @throws EncoderException\n     *                  if an error occurs encoding one of the strings\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The maximum length of a Soundex code - Soundex codes are only four characters by definition.\n     * \n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "soundexMapping"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char array holds the values to which each\n     * letter is mapped. This implementation contains a default map for US_ENGLISH\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Creates an instance using US_ENGLISH_MAPPING\n     * \n     * @see Soundex#Soundex(char[])\n     * @see Soundex#US_ENGLISH_MAPPING\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex(char[])",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Creates a soundex instance using the given mapping. This constructor can be used to provide an internationalized\n     * mapping for a non-Western character set.\n     * \n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char array holds the values to which each\n     * letter is mapped. This implementation contains a default map for US_ENGLISH\n     * \n     * @param mapping\n     *                  Mapping array to use when finding the corresponding code for a given character\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 55)",
        "(line 118,col 9)-(line 118,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex(java.lang.String)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Creates a refined soundex instance using a custom mapping. This constructor can be used to customize the mapping,\n     * and/or possibly provide an internationalized mapping for a non-Western character set.\n     * \n     * @param mapping\n     *            Mapping string to use when finding the corresponding code for a given character\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.Object)",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Encodes an Object using the soundex algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type java.lang.String.\n     * \n     * @param pObject\n     *                  Object to encode\n     * @return An object (or type java.lang.String) containing the soundex code which corresponds to the String\n     *             supplied.\n     * @throws EncoderException\n     *                  if the parameter supplied is not of type java.lang.String\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.String)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Encodes a String using the soundex algorithm.\n     * \n     * @param pString\n     *                  A String object to encode\n     * @return A Soundex code corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getMappingCode(java.lang.String, int)",
      "begin_line": 179,
      "end_line": 194,
      "comment": "\n     * Used internally by the SoundEx algorithm.\n     * \n     * Consonants from the same code group separated by W or H are treated as one.\n     * \n     * @param str\n     *                  the cleaned working string to encode (in upper case).\n     * @param index\n     *                  the character position to encode\n     * @return Mapping code for a particular character\n     * @throws IllegalArgumentException\n     *                  if the character is not mapped\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 54)",
        "(line 183,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getMaxLength()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Returns the maxLength. Standard Soundex\n     * \n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @return int\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getSoundexMapping()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns the soundex mapping.\n     * \n     * @return soundexMapping.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.map(char)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Maps the given upper-case character to its Soundex code.\n     * \n     * @param ch\n     *                  An upper-case character.\n     * @return A Soundex code.\n     * @throws IllegalArgumentException\n     *                  Thrown if \u003ccode\u003ech\u003c/code\u003e is not mapped.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.setMaxLength(int)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Sets the maxLength.\n     * \n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @param maxLength\n     *                  The maxLength to set\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.soundex(java.lang.String)",
      "begin_line": 252,
      "end_line": 276,
      "comment": "\n     * Retrieves the Soundex code for a given String object.\n     * \n     * @param str\n     *                  String to encode using the Soundex algorithm\n     * @return A soundex code for the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 38)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 42)",
        "(line 261,col 9)-(line 261,col 26)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 31)",
        "(line 265,col 9)-(line 265,col 38)",
        "(line 266,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 31)"
      ]
    }
  ]
}