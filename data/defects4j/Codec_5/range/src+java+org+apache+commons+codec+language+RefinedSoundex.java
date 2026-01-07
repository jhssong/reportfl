{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/language/RefinedSoundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RefinedSoundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 31,
      "end_line": 202,
      "comment": "\n * Encodes a string into a Refined Soundex value. A refined soundex code is\n * optimized for spell checking words. Soundex method originally developed by\n * \u003cCITE\u003eMargaret Odell\u003c/CITE\u003e and \u003cCITE\u003eRobert Russell\u003c/CITE\u003e.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING_STRING"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * RefinedSoundex is *refined* for a number of reasons one being that the\n     * mappings have been altered. This implementation contains default\n     * mappings for US English.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "soundexMapping"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Every letter of the alphabet is \"mapped\" to a numerical value. This char\n     * array holds the values to which each letter is mapped. This\n     * implementation contains a default map for US_ENGLISH\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * This static variable contains an instance of the RefinedSoundex using\n     * the US_ENGLISH mapping.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Creates an instance of the RefinedSoundex object using the default US\n     * English mapping.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex(char[])",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Creates a refined soundex instance using a custom mapping. This\n     * constructor can be used to customize the mapping, and/or possibly\n     * provide an internationalized mapping for a non-Western character set.\n     * \n     * @param mapping\n     *                  Mapping array to use when finding the corresponding code for\n     *                  a given character\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 55)",
        "(line 77,col 9)-(line 77,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Creates a refined Soundex instance using a custom mapping. This constructor can be used to customize the mapping,\n     * and/or possibly provide an internationalized mapping for a non-Western character set.\n     * \n     * @param mapping\n     *            Mapping string to use when finding the corresponding code for a given character\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.difference(java.lang.String, java.lang.String)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the number of characters in the two encoded Strings that are the\n     * same. This return value ranges from 0 to the length of the shortest\n     * encoded String: 0 indicates little or no similarity, and 4 out of 4 (for\n     * example) indicates strong similarity or identical values. For refined\n     * Soundex, the return value can be greater than 4.\n     * \n     * @param s1\n     *                  A String that will be encoded and compared.\n     * @param s2\n     *                  A String that will be encoded and compared.\n     * @return The number of characters in the two encoded Strings that are the\n     *             same from 0 to to the length of the shortest encoded String.\n     * \n     * @see SoundexUtils#difference(StringEncoder,String,String)\n     * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n     *          MS T-SQL DIFFERENCE\u003c/a\u003e\n     * \n     * @throws EncoderException\n     *                  if an error occurs encoding one of the strings\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.Object)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * Encodes an Object using the refined soundex algorithm. This method is\n     * provided in order to satisfy the requirements of the Encoder interface,\n     * and will throw an EncoderException if the supplied object is not of type\n     * java.lang.String.\n     * \n     * @param pObject\n     *                  Object to encode\n     * @return An object (or type java.lang.String) containing the refined\n     *             soundex code which corresponds to the String supplied.\n     * @throws EncoderException\n     *                  if the parameter supplied is not of type java.lang.String\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.String)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Encodes a String using the refined soundex algorithm.\n     * \n     * @param pString\n     *                  A String object to encode\n     * @return A Soundex code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.getMappingCode(char)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\n     * Returns the mapping code for a given character. The mapping codes are\n     * maintained in an internal char array named soundexMapping, and the\n     * default values of these mappings are US English.\n     * \n     * @param c\n     *                  char to get mapping for\n     * @return A character (really a numeral) to return for the given char\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.soundex(java.lang.String)",
      "begin_line": 172,
      "end_line": 201,
      "comment": "\n     * Retreives the Refined Soundex code for a given String object.\n     * \n     * @param str\n     *                  String to encode using the Refined Soundex algorithm\n     * @return A soundex code for the String supplied\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 185,col 9)-(line 185,col 19)",
        "(line 187,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 31)"
      ]
    }
  ]
}