{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/binary/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 40,
      "end_line": 600,
      "comment": "\n * Provides Base64 encoding and decoding as defined by RFC 2045.\n * \n * \u003cp\u003e\n * This class implements section \u003ccite\u003e6.8. Base64 Content-Transfer-Encoding\u003c/cite\u003e from RFC 2045 \u003ccite\u003eMultipurpose\n * Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies\u003c/cite\u003e by Freed and Borenstein.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @since 1.0-dev\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SIZE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Chunk size per RFC 2045 section 6.8.\n     * \n     * \u003cp\u003e\n     * The {@value} character limit does not count the trailing CRLF, but counts all other characters, including any\n     * equal signs.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 6.8\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHUNK_SEPARATOR"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Chunk separator per RFC 2045 section 2.1.\n     * \n     * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045 section 2.1\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BASELENGTH"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The base length.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LOOKUPLENGTH"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Lookup length.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTBIT"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Used to calculate the number of bits in a byte.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIXTEENBIT"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Used when encoding something which has fewer than 24 bits.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWENTYFOURBITGROUP"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Used to determine how many bits data contains.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOURBYTE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Used to get the number of Quadruples.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIGN"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Used to test the sign of a byte.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Byte used to pad output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "base64Alphabet"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Contains the Base64 values \u003ccode\u003e0\u003c/code\u003e through \u003ccode\u003e63\u003c/code\u003e accessed by using character encodings as\n     * indices.\n     * \u003cp\u003e\n     * For example, \u003ccode\u003ebase64Alphabet[\u0027+\u0027]\u003c/code\u003e returns \u003ccode\u003e62\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The value of undefined encodings is \u003ccode\u003e-1\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lookUpBase64Alphabet"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003e\n     * Contains the Base64 encodings \u003ccode\u003eA\u003c/code\u003e through \u003ccode\u003eZ\u003c/code\u003e, followed by \u003ccode\u003ea\u003c/code\u003e through\n     * \u003ccode\u003ez\u003c/code\u003e, followed by \u003ccode\u003e0\u003c/code\u003e through \u003ccode\u003e9\u003c/code\u003e, followed by \u003ccode\u003e+\u003c/code\u003e, and\n     * \u003ccode\u003e/\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This array is accessed by using character values as indices.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For example, \u003ccode\u003elookUpBase64Alphabet[62] \u003c/code\u003e returns \u003ccode\u003e\u0027+\u0027\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isBase64(byte)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "\n     * Returns whether or not the \u003ccode\u003eoctect\u003c/code\u003e is in the base 64 alphabet.\n     * \n     * @param octect\n     *            The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the value is defined in the the base 64 alphabet, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.isArrayByteBase64(byte[])",
      "begin_line": 187,
      "end_line": 203,
      "comment": "\n     * Tests a given byte array to see if it contains only valid characters within the Base64 alphabet.\n     * \n     * @param arrayOctect\n     *            byte array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all bytes are valid characters in the Base64 alphabet or if the byte array is\n     *         empty; false, otherwise\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 53)",
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[])",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Encodes binary data using the base64 algorithm but does not chunk the output.\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byte[])",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Encodes binary data using the base64 algorithm and chunks the encoded output into 76 character blocks\n     * \n     * @param binaryData\n     *            binary data to encode\n     * @return Base64 characters chunked in 76 character blocks\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(java.lang.Object)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Decodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Decoder interface, and will throw a DecoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to decode\n     * @return An object (of type byte[]) containing the binary data which corresponds to the byte[] supplied.\n     * @throws DecoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decode(byte[])",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Decodes a byte[] containing containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            A byte array containing Base64 character data\n     * @return a byte array containing binary data\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeBase64(byte[], boolean)",
      "begin_line": 266,
      "end_line": 383,
      "comment": "\n     * Encodes binary data using the base64 algorithm, optionally chunking the output into 76 character blocks.\n     * \n     * @param binaryData\n     *            Array containing binary data to encode.\n     * @param isChunked\n     *            if \u003ccode\u003etrue\u003c/code\u003e this encoder will chunk the base64 output into 76 character blocks\n     * @return Base64-encoded data.\n     * @throws IllegalArgumentException\n     *             Thrown when the input array needs an output array bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 50)",
        "(line 268,col 9)-(line 268,col 58)",
        "(line 269,col 9)-(line 269,col 67)",
        "(line 270,col 9)-(line 270,col 64)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 28)",
        "(line 274,col 9)-(line 280,col 9)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 60)",
        "(line 297,col 9)-(line 297,col 57)",
        "(line 299,col 9)-(line 299,col 50)",
        "(line 301,col 9)-(line 301,col 29)",
        "(line 302,col 9)-(line 302,col 26)",
        "(line 303,col 9)-(line 303,col 18)",
        "(line 304,col 9)-(line 304,col 44)",
        "(line 305,col 9)-(line 305,col 28)",
        "(line 308,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 346,col 26)",
        "(line 348,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeBase64(byte[])",
      "begin_line": 392,
      "end_line": 450,
      "comment": "\n     * Decodes Base64 data into octects\n     * \n     * @param base64Data\n     *            Byte array containing Base64 data\n     * @return Array containing decoded data.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 50)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 59)",
        "(line 402,col 9)-(line 402,col 34)",
        "(line 403,col 9)-(line 403,col 70)",
        "(line 407,col 9)-(line 407,col 29)",
        "(line 408,col 9)-(line 408,col 26)",
        "(line 409,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardWhitespace(byte[])",
      "begin_line": 459,
      "end_line": 480,
      "comment": "\n     * Discards any whitespace from a base-64 encoded block.\n     * \n     * @param data\n     *            The base-64 encoded data to discard the whitespace from.\n     * @return The data, less whitespace (see RFC 2045).\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 51)",
        "(line 461,col 9)-(line 461,col 28)",
        "(line 463,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 50)",
        "(line 477,col 9)-(line 477,col 69)",
        "(line 479,col 9)-(line 479,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.discardNonBase64(byte[])",
      "begin_line": 490,
      "end_line": 505,
      "comment": "\n     * Discards any characters outside of the base64 alphabet, per the requirements on page 25 of RFC 2045 - \"Any\n     * characters outside of the base64 alphabet are to be ignored in base64 encoded data.\"\n     * \n     * @param data\n     *            The base-64 encoded data to groom\n     * @return The data, less non-base64 characters (see RFC 2045).\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 51)",
        "(line 492,col 9)-(line 492,col 28)",
        "(line 494,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 500,col 50)",
        "(line 502,col 9)-(line 502,col 69)",
        "(line 504,col 9)-(line 504,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(java.lang.Object)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\n     * Encodes an Object using the base64 algorithm. This method is provided in order to satisfy the requirements of the\n     * Encoder interface, and will throw an EncoderException if the supplied object is not of type byte[].\n     * \n     * @param pObject\n     *            Object to encode\n     * @return An object (of type byte[]) containing the base64 encoded data which corresponds to the byte[] supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type byte[]\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encode(byte[])",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Encodes a byte[] containing binary data, into a byte[] containing characters in the Base64 alphabet.\n     * \n     * @param pArray\n     *            a byte array containing binary data\n     * @return A byte array containing only Base64 character data\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.decodeInteger(byte[])",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * Decode a byte64-encoded integer according to crypto\n     * standards such as W3C\u0027s XML-Signature\n     * \n     * @param pArray a byte array containing base64 character data\n     * @return A BigInteger\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.encodeInteger(java.math.BigInteger)",
      "begin_line": 557,
      "end_line": 563,
      "comment": "\n     * Encode to a byte64-encoded integer according to crypto\n     * standards such as W3C\u0027s XML-Signature\n     * \n     * @param bigInt a BigInteger\n     * @return A byte array containing base64 character data\n     * @throws NullPointerException if null is passed in\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64.toIntegerBytes(java.math.BigInteger)",
      "begin_line": 572,
      "end_line": 599,
      "comment": "\n     * Returns a byte-array representation of a \u003ccode\u003eBigInteger\u003c/code\u003e\n     * without sign bit.\n     *\n     * @param bigInt \u003ccode\u003eBigInteger\u003c/code\u003e to be converted\n     * @return a byte array representation of the BigInteger parameter\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 40)",
        "(line 575,col 9)-(line 575,col 42)",
        "(line 576,col 9)-(line 576,col 47)",
        "(line 578,col 9)-(line 581,col 9)",
        "(line 584,col 9)-(line 584,col 25)",
        "(line 585,col 9)-(line 585,col 34)",
        "(line 588,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 40)",
        "(line 594,col 9)-(line 594,col 51)",
        "(line 596,col 9)-(line 596,col 74)",
        "(line 598,col 9)-(line 598,col 28)"
      ]
    }
  ]
}