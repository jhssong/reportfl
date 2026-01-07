{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/language/RefinedSoundex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RefinedSoundex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 31,
      "end_line": 184,
      "comment": "\n * Encodes a string into a Refined Soundex value. A refined soundex code is\n * optimized for spell checking words. Soundex method originally developed by\n * \u003cCITE\u003eMargaret Odell\u003c/CITE\u003e and \u003cCITE\u003eRobert Russell\u003c/CITE\u003e.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH_MAPPING"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n\t * RefinedSoundex is *refined* for a number of reasons one being that the\n\t * mappings have been altered. This implementation contains default\n\t * mappings for US English.\n\t "
    },
    {
      "type": "field",
      "varNames": [
        "soundexMapping"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n\t * Every letter of the alphabet is \"mapped\" to a numerical value. This char\n\t * array holds the values to which each letter is mapped. This\n\t * implementation contains a default map for US_ENGLISH\n\t "
    },
    {
      "type": "field",
      "varNames": [
        "US_ENGLISH"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n\t * This static variable contains an instance of the RefinedSoundex using\n\t * the US_ENGLISH mapping.\n\t "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n\t * Creates an instance of the RefinedSoundex object using the default US\n\t * English mapping.\n\t ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.RefinedSoundex(char[])",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n\t * Creates a refined soundex instance using a custom mapping. This\n\t * constructor can be used to customize the mapping, and/or possibly\n\t * provide an internationalized mapping for a non-Western character set.\n\t * \n\t * @param mapping\n\t *                  Mapping array to use when finding the corresponding code for\n\t *                  a given character\n\t ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.difference(java.lang.String, java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n\t * Returns the number of characters in the two encoded Strings that are the\n\t * same. This return value ranges from 0 to the length of the shortest\n\t * encoded String: 0 indicates little or no similarity, and 4 out of 4 (for\n\t * example) indicates strong similarity or identical values. For refined\n\t * Soundex, the return value can be greater than 4.\n\t * \n\t * @param s1\n\t *                  A String that will be encoded and compared.\n\t * @param s2\n\t *                  A String that will be encoded and compared.\n\t * @return The number of characters in the two encoded Strings that are the\n\t *             same from 0 to to the length of the shortest encoded String.\n\t * \n\t * @see SoundexUtils#difference(StringEncoder,String,String)\n\t * @see \u003ca href\u003d\"http://msdn.microsoft.com/library/default.asp?url\u003d/library/en-us/tsqlref/ts_de-dz_8co5.asp\"\u003e\n\t *          MS T-SQL DIFFERENCE\u003c/a\u003e\n\t * \n\t * @throws EncoderException\n\t *                  if an error occurs encoding one of the strings\n     * @since 1.3\n\t ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.Object)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n\t * Encodes an Object using the refined soundex algorithm. This method is\n\t * provided in order to satisfy the requirements of the Encoder interface,\n\t * and will throw an EncoderException if the supplied object is not of type\n\t * java.lang.String.\n\t * \n\t * @param pObject\n\t *                  Object to encode\n\t * @return An object (or type java.lang.String) containing the refined\n\t *             soundex code which corresponds to the String supplied.\n\t * @throws EncoderException\n\t *                  if the parameter supplied is not of type java.lang.String\n\t ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.encode(java.lang.String)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n\t * Encodes a String using the refined soundex algorithm.\n\t * \n\t * @param pString\n\t *                  A String object to encode\n\t * @return A Soundex code corresponding to the String supplied\n\t ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.getMappingCode(char)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n\t * Returns the mapping code for a given character. The mapping codes are\n\t * maintained in an internal char array named soundexMapping, and the\n\t * default values of these mappings are US English.\n\t * \n\t * @param c\n\t *                  char to get mapping for\n\t * @return A character (really a numeral) to return for the given char\n\t ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.RefinedSoundex.soundex(java.lang.String)",
      "begin_line": 154,
      "end_line": 183,
      "comment": "\n\t * Retreives the Refined Soundex code for a given String object.\n\t * \n\t * @param str\n\t *                  String to encode using the Refined Soundex algorithm\n\t * @return A soundex code for the String supplied\n\t ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 38)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 166,col 27)",
        "(line 167,col 9)-(line 167,col 19)",
        "(line 169,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 31)"
      ]
    }
  ]
}