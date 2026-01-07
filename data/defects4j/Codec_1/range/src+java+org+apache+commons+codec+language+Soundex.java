{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/language/Soundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Soundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 30,
      "end_line": 275,
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
        "(line 103,col 9)-(line 103,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.Soundex.Soundex(char[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Creates a soundex instance using the given mapping. This constructor can be used to provide an internationalized\n     * mapping for a non-Western character set.\n     * \n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char array holds the values to which each\n     * letter is mapped. This implementation contains a default map for US_ENGLISH\n     * \n     * @param mapping\n     *                  Mapping array to use when finding the corresponding code for a given character\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.Object)",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * Encodes an Object using the soundex algorithm. This method is provided in order to satisfy the requirements of\n     * the Encoder interface, and will throw an EncoderException if the supplied object is not of type java.lang.String.\n     * \n     * @param pObject\n     *                  Object to encode\n     * @return An object (or type java.lang.String) containing the soundex code which corresponds to the String\n     *             supplied.\n     * @throws EncoderException\n     *                  if the parameter supplied is not of type java.lang.String\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.encode(java.lang.String)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Encodes a String using the soundex algorithm.\n     * \n     * @param pString\n     *                  A String object to encode\n     * @return A Soundex code corresponding to the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getMappingCode(java.lang.String, int)",
      "begin_line": 166,
      "end_line": 181,
      "comment": "\n     * Used internally by the SoundEx algorithm.\n     * \n     * Consonants from the same code group separated by W or H are treated as one.\n     * \n     * @param str\n     *                  the cleaned working string to encode (in upper case).\n     * @param index\n     *                  the character position to encode\n     * @return Mapping code for a particular character\n     * @throws IllegalArgumentException\n     *                  if the character is not mapped\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 54)",
        "(line 170,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getMaxLength()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns the maxLength. Standard Soundex\n     * \n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @return int\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.getSoundexMapping()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns the soundex mapping.\n     * \n     * @return soundexMapping.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.map(char)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Maps the given upper-case character to it\u0027s Soudex code.\n     * \n     * @param ch\n     *                  An upper-case character.\n     * @return A Soundex code.\n     * @throws IllegalArgumentException\n     *                  Thrown if \u003ccode\u003ech\u003c/code\u003e is not mapped.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 29)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.setMaxLength(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Sets the maxLength.\n     * \n     * @deprecated This feature is not needed since the encoding size must be constant. Will be removed in 2.0.\n     * @param maxLength\n     *                  The maxLength to set\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.setSoundexMapping(char[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Sets the soundexMapping.\n     * \n     * @param soundexMapping\n     *                  The soundexMapping to set.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.Soundex.soundex(java.lang.String)",
      "begin_line": 249,
      "end_line": 273,
      "comment": "\n     * Retreives the Soundex code for a given String object.\n     * \n     * @param str\n     *                  String to encode using the Soundex algorithm\n     * @return A soundex code for the String supplied\n     * @throws IllegalArgumentException\n     *                  if a character is not mapped\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 38)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 258,col 9)-(line 258,col 26)",
        "(line 259,col 9)-(line 259,col 35)",
        "(line 260,col 9)-(line 260,col 31)",
        "(line 262,col 9)-(line 262,col 38)",
        "(line 263,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 31)"
      ]
    }
  ]
}