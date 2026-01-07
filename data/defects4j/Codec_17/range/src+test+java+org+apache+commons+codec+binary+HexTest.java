{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/HexTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HexTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 501,
      "comment": "\n * Tests {@link org.apache.commons.codec.binary.Hex}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAD_ENCODING_NAME"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOG"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.charsetSanityCheck(java.lang.String)",
      "begin_line": 49,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 77)",
        "(line 51,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.checkDecodeHexCharArrayOddCharacters(char[])",
      "begin_line": 99,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.checkDecodeHexCharArrayOddCharacters(java.lang.String)",
      "begin_line": 108,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.log(java.lang.String)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.log(java.lang.Throwable)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testCustomCharset()",
      "begin_line": 131,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testCustomCharset(java.lang.String, java.lang.String)",
      "begin_line": 144,
      "end_line": 177,
      "comment": "\n     * @param name\n     * @param parent\n     * @throws UnsupportedEncodingException\n     * @throws DecoderException\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 46)",
        "(line 152,col 9)-(line 152,col 50)",
        "(line 153,col 9)-(line 153,col 63)",
        "(line 156,col 9)-(line 156,col 74)",
        "(line 158,col 9)-(line 158,col 68)",
        "(line 160,col 9)-(line 160,col 79)",
        "(line 161,col 9)-(line 161,col 85)",
        "(line 163,col 9)-(line 163,col 76)",
        "(line 164,col 9)-(line 165,col 81)",
        "(line 167,col 9)-(line 167,col 40)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 169,col 9)-(line 169,col 85)",
        "(line 170,col 9)-(line 170,col 85)",
        "(line 172,col 9)-(line 172,col 64)",
        "(line 174,col 9)-(line 174,col 81)",
        "(line 175,col 9)-(line 175,col 69)",
        "(line 176,col 9)-(line 176,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testCustomCharsetBadName()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testCustomCharsetToString()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeBadCharacterPos0()",
      "begin_line": 189,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeBadCharacterPos1()",
      "begin_line": 199,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteArrayEmpty()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteArrayObjectEmpty()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteArrayOddCharacters()",
      "begin_line": 219,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteBufferEmpty()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteBufferObjectEmpty()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeByteBufferOddCharacters()",
      "begin_line": 239,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 57)",
        "(line 242,col 9)-(line 242,col 30)",
        "(line 243,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexCharArrayEmpty()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexStringEmpty()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeClassCastException()",
      "begin_line": 261,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexCharArrayOddCharacters1()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexStringOddCharacters1()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexCharArrayOddCharacters3()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexCharArrayOddCharacters5()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeHexStringOddCharacters()",
      "begin_line": 291,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testDecodeStringEmpty()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeByteArrayEmpty()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeByteArrayObjectEmpty()",
      "begin_line": 311,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeByteBufferEmpty()",
      "begin_line": 316,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeByteBufferObjectEmpty()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeClassCastException()",
      "begin_line": 326,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeDecodeHexCharArrayRandom()",
      "begin_line": 336,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 43)",
        "(line 340,col 9)-(line 340,col 34)",
        "(line 341,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteArrayEmpty()",
      "begin_line": 369,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 75)",
        "(line 372,col 9)-(line 372,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteArrayHelloWorldLowerCaseHex()",
      "begin_line": 375,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 65)",
        "(line 378,col 9)-(line 378,col 57)",
        "(line 379,col 9)-(line 379,col 22)",
        "(line 380,col 9)-(line 380,col 34)",
        "(line 381,col 9)-(line 381,col 51)",
        "(line 382,col 9)-(line 382,col 40)",
        "(line 383,col 9)-(line 383,col 51)",
        "(line 384,col 9)-(line 384,col 41)",
        "(line 385,col 9)-(line 385,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteArrayHelloWorldUpperCaseHex()",
      "begin_line": 388,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 65)",
        "(line 391,col 9)-(line 391,col 57)",
        "(line 392,col 9)-(line 392,col 22)",
        "(line 393,col 9)-(line 393,col 34)",
        "(line 394,col 9)-(line 394,col 57)",
        "(line 395,col 9)-(line 395,col 40)",
        "(line 396,col 9)-(line 396,col 57)",
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteArrayZeroes()",
      "begin_line": 401,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 53)",
        "(line 404,col 9)-(line 404,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteBufferEmpty()",
      "begin_line": 407,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 86)",
        "(line 410,col 9)-(line 410,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteBufferHelloWorldLowerCaseHex()",
      "begin_line": 413,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 74)",
        "(line 416,col 9)-(line 416,col 57)",
        "(line 417,col 9)-(line 417,col 22)",
        "(line 418,col 9)-(line 418,col 34)",
        "(line 419,col 9)-(line 419,col 51)",
        "(line 420,col 9)-(line 420,col 40)",
        "(line 421,col 9)-(line 421,col 51)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 423,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteBufferHelloWorldUpperCaseHex()",
      "begin_line": 426,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 74)",
        "(line 429,col 9)-(line 429,col 57)",
        "(line 430,col 9)-(line 430,col 22)",
        "(line 431,col 9)-(line 431,col 34)",
        "(line 432,col 9)-(line 432,col 57)",
        "(line 433,col 9)-(line 433,col 40)",
        "(line 434,col 9)-(line 434,col 57)",
        "(line 435,col 9)-(line 435,col 41)",
        "(line 436,col 9)-(line 436,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHex_ByteBufferOfZeroes()",
      "begin_line": 439,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 64)",
        "(line 442,col 9)-(line 442,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteBufferOfZeroes()",
      "begin_line": 445,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 70)",
        "(line 448,col 9)-(line 448,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteArrayOfZeroes()",
      "begin_line": 451,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 59)",
        "(line 454,col 9)-(line 454,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteArrayBoolean_ToLowerCase()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteArrayBoolean_ToUpperCase()",
      "begin_line": 462,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteBufferBoolean_ToLowerCase()",
      "begin_line": 467,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeHexByteString_ByteBufferBoolean_ToUpperCase()",
      "begin_line": 472,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testEncodeStringEmpty()",
      "begin_line": 477,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testGetCharset()",
      "begin_line": 482,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testGetCharsetName()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.HexTest.testRequiredCharset()",
      "begin_line": 492,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 58)",
        "(line 495,col 9)-(line 495,col 59)",
        "(line 496,col 9)-(line 496,col 61)",
        "(line 497,col 9)-(line 497,col 61)",
        "(line 498,col 9)-(line 498,col 61)",
        "(line 499,col 9)-(line 499,col 62)"
      ]
    }
  ]
}