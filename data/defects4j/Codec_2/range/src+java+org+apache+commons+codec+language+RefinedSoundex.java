{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/language/RefinedSoundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RefinedSoundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 31,
      "end_line": 200,
      "comment": "\n * Encodes a string into a Refined Soundex value. A refined soundex code is\n * optimized for spell checking words. Soundex method originally developed by\n * \u003cCITE\u003eMargaret Odell\u003c/CITE\u003e and \u003cCITE\u003eRobert Russell\u003c/CITE\u003e.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING_STRING"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * RefinedSoundex is *refined* for a number of reasons one being that the\n     * mappings have been altered. This implementation contains default\n     * mappings for US English.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "soundexMapping"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char\n     * array holds the values to which each letter is mapped. This\n     * implementation contains a default map for US_ENGLISH\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * This static variable contains an instance of the RefinedSoundex using\n     * the US_ENGLISH mapping.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Creates an instance of the RefinedSoundex object using the default US\n     * English mapping.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex(char[])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Creates a refined soundex instance using a custom mapping. This\n     * constructor can be used to customize the mapping, and/or possibly\n     * provide an internationalized mapping for a non-Western character set.\n     * \n     * @param mapping\n     *                  Mapping array to use when finding the corresponding code for\n     *                  a given character\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)",
        "(line 74,col 9)-(line 74,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Creates a refined soundex instance using a custom mapping. This\n     * constructor can be used to customize the mapping, and/or possibly\n     * provide an internationalized mapping for a non-Western character set.\n     * \n     * @param mapping\n     *                  Mapping string to use when finding the corresponding code for\n     *                  a given character\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.difference(java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Returns the number of characters in the two encoded Strings that are the\n     * same. This return value ranges from 0 to the length of the shortest\n     * encoded String: 0 indicates little or no similarity, and 4 out of 4 (for\n     * example) indicates strong similarity or identical values. For refined\n     * Soundex, the return value can be greater than 4.\n     * \n     * @param s1\n     *                  A String that will be encoded and compared.\n     * @param s2\n     *                  A String that will be encoded and compared.\n     * @return The number of characters in the two encoded Strings that are the\n     *             same from 0 to to the length of the shortest encoded String.\n     * \n     * @see SoundexUtils#difference(StringEncoder,String,String)\n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n     *          MS T-SQL DIFFERENCE\u003c/a\u003e\n     * \n     * @throws EncoderException\n     *                  if an error occurs encoding one of the strings\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.Object)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * Encodes an Object using the refined soundex algorithm. This method is\n     * provided in order to satisfy the requirements of the Encoder interface,\n     * and will throw an EncoderException if the supplied object is not of type\n     * java.lang.String.\n     * \n     * @param pObject\n     *                  Object to encode\n     * @return An object (or type java.lang.String) containing the refined\n     *             soundex code which corresponds to the String supplied.\n     * @throws EncoderException\n     *                  if the parameter supplied is not of type java.lang.String\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.String)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Encodes a String using the refined soundex algorithm.\n     * \n     * @param pString\n     *                  A String object to encode\n     * @return A Soundex code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.getMappingCode(char)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Returns the mapping code for a given character. The mapping codes are\n     * maintained in an internal char array named soundexMapping, and the\n     * default values of these mappings are US English.\n     * \n     * @param c\n     *                  char to get mapping for\n     * @return A character (really a numeral) to return for the given char\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.soundex(java.lang.String)",
      "begin_line": 170,
      "end_line": 199,
      "comment": "\n     * Retreives the Refined Soundex code for a given String object.\n     * \n     * @param str\n     *                  String to encode using the Refined Soundex algorithm\n     * @return A soundex code for the String supplied\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 19)",
        "(line 185,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 31)"
      ]
    }
  ]
}