{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/Base64Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 1301,
      "comment": "\n * Test cases for Base64 class.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHARSET_UTF8"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.getRandom()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return Returns the random.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsStringBase64()",
      "begin_line": 60,
      "end_line": 78,
      "comment": "\n     * Test the isStringBase64 method.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 38)",
        "(line 64,col 9)-(line 64,col 103)",
        "(line 65,col 9)-(line 65,col 60)",
        "(line 68,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 96)",
        "(line 76,col 9)-(line 76,col 96)",
        "(line 77,col 9)-(line 77,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64()",
      "begin_line": 83,
      "end_line": 110,
      "comment": "\n     * Test the Base64 implementation\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 85)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 89,col 9)-(line 89,col 81)",
        "(line 91,col 9)-(line 91,col 66)",
        "(line 96,col 9)-(line 96,col 69)",
        "(line 97,col 9)-(line 97,col 65)",
        "(line 98,col 9)-(line 98,col 81)",
        "(line 100,col 9)-(line 100,col 34)",
        "(line 102,col 9)-(line 102,col 69)",
        "(line 103,col 9)-(line 103,col 65)",
        "(line 104,col 9)-(line 104,col 81)",
        "(line 107,col 9)-(line 107,col 99)",
        "(line 108,col 9)-(line 108,col 70)",
        "(line 109,col 9)-(line 109,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64AtBufferStart()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64AtBufferEnd()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64AtBufferMiddle()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64InBuffer(int, int)",
      "begin_line": 127,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 67)",
        "(line 131,col 9)-(line 131,col 75)",
        "(line 132,col 9)-(line 132,col 67)",
        "(line 133,col 9)-(line 133,col 90)",
        "(line 134,col 9)-(line 134,col 65)",
        "(line 135,col 9)-(line 135,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithInnerPad()",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Test our decode with pad character in the middle. (Our current\n     * implementation: halt decode and return what we\u0027ve got so far).\n     *\n     * The point of this test is not to say\n     * \"this is the correct way to decode base64.\" The point is simply to keep\n     * us aware of the current logic since 1.4 so we don\u0027t accidentally break it\n     * without realizing.\n     *\n     * Note for historians. The 1.3 logic would decode to:\n     * \"Hello World\\u0000Hello World\" -- null in the middle --- and 1.4\n     * unwittingly changed it to current logic.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 66)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 72)",
        "(line 156,col 9)-(line 156,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testChunkedEncodeMultipleOf76()",
      "begin_line": 162,
      "end_line": 171,
      "comment": "\n     * Tests Base64.encodeBase64().\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 88)",
        "(line 168,col 9)-(line 168,col 102)",
        "(line 169,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 170,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec68()",
      "begin_line": 177,
      "end_line": 181,
      "comment": "\n     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some\n     * non-BASE64 bytes\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 72)",
        "(line 180,col 9)-(line 180,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger1()",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 66)",
        "(line 186,col 9)-(line 186,col 107)",
        "(line 188,col 9)-(line 188,col 77)",
        "(line 189,col 9)-(line 189,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger2()",
      "begin_line": 192,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 66)",
        "(line 195,col 9)-(line 195,col 108)",
        "(line 197,col 9)-(line 197,col 77)",
        "(line 198,col 9)-(line 198,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger3()",
      "begin_line": 201,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 204,col 64)",
        "(line 205,col 9)-(line 207,col 94)",
        "(line 209,col 9)-(line 209,col 77)",
        "(line 210,col 9)-(line 210,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger4()",
      "begin_line": 213,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 91)",
        "(line 218,col 9)-(line 223,col 68)",
        "(line 225,col 9)-(line 225,col 77)",
        "(line 226,col 9)-(line 226,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerEdgeCases()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerNull()",
      "begin_line": 234,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructors()",
      "begin_line": 246,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 22)",
        "(line 249,col 9)-(line 249,col 30)",
        "(line 250,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 251,col 47)",
        "(line 252,col 9)-(line 252,col 47)",
        "(line 253,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 52)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 75)",
        "(line 281,col 9)-(line 281,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean()",
      "begin_line": 284,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 73)",
        "(line 287,col 9)-(line 287,col 69)",
        "(line 288,col 9)-(line 288,col 73)",
        "(line 289,col 9)-(line 289,col 60)",
        "(line 290,col 9)-(line 290,col 65)",
        "(line 291,col 9)-(line 291,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean_UrlSafe()",
      "begin_line": 294,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 72)",
        "(line 298,col 9)-(line 298,col 69)",
        "(line 299,col 9)-(line 299,col 73)",
        "(line 300,col 9)-(line 300,col 60)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 303,col 9)-(line 303,col 58)",
        "(line 304,col 9)-(line 304,col 58)",
        "(line 305,col 9)-(line 305,col 65)",
        "(line 306,col 9)-(line 306,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex2()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Tests conditional true branch for \"marker0\" test.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex3()",
      "begin_line": 320,
      "end_line": 324,
      "comment": "\n     * Tests conditional branches for \"marker1\" test.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 91)",
        "(line 323,col 9)-(line 323,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnly()",
      "begin_line": 326,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 83)",
        "(line 329,col 9)-(line 329,col 89)",
        "(line 331,col 9)-(line 331,col 82)",
        "(line 332,col 9)-(line 332,col 81)",
        "(line 333,col 9)-(line 333,col 80)",
        "(line 334,col 9)-(line 334,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnlyChunked()",
      "begin_line": 337,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 85)",
        "(line 340,col 9)-(line 340,col 91)",
        "(line 342,col 9)-(line 342,col 84)",
        "(line 343,col 9)-(line 343,col 83)",
        "(line 344,col 9)-(line 344,col 82)",
        "(line 345,col 9)-(line 345,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithWhitespace()",
      "begin_line": 348,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 55)",
        "(line 353,col 9)-(line 353,col 85)",
        "(line 354,col 9)-(line 354,col 87)",
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 357,col 37)",
        "(line 358,col 9)-(line 358,col 38)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 361,col 9)-(line 361,col 84)",
        "(line 362,col 9)-(line 362,col 72)",
        "(line 364,col 9)-(line 364,col 54)",
        "(line 366,col 9)-(line 366,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEmptyBase64()",
      "begin_line": 372,
      "end_line": 383,
      "comment": "\n     * Test encode and decode of empty byte array.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 35)",
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 376,col 62)",
        "(line 377,col 9)-(line 377,col 77)",
        "(line 379,col 9)-(line 379,col 28)",
        "(line 380,col 9)-(line 380,col 44)",
        "(line 381,col 9)-(line 381,col 62)",
        "(line 382,col 9)-(line 382,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeRandom()",
      "begin_line": 386,
      "end_line": 396,
      "comment": " encode/decode a large random array",
      "child_ranges": [
        "(line 388,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeSmall()",
      "begin_line": 399,
      "end_line": 409,
      "comment": " encode/decode random arrays from size 0 to size 11",
      "child_ranges": [
        "(line 401,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize()",
      "begin_line": 411,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 34)",
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 33)",
        "(line 416,col 9)-(line 416,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec112()",
      "begin_line": 419,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 43)",
        "(line 422,col 9)-(line 422,col 51)",
        "(line 423,col 9)-(line 423,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize(int)",
      "begin_line": 426,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIgnoringNonBase64InDecode()",
      "begin_line": 435,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 440,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsArrayByteBase64()",
      "begin_line": 443,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 68)",
        "(line 446,col 9)-(line 446,col 58)",
        "(line 447,col 9)-(line 447,col 57)",
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 72)",
        "(line 450,col 9)-(line 450,col 68)",
        "(line 451,col 9)-(line 451,col 56)",
        "(line 452,col 9)-(line 452,col 73)",
        "(line 453,col 9)-(line 453,col 66)",
        "(line 454,col 9)-(line 454,col 66)",
        "(line 455,col 9)-(line 455,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsUrlSafe()",
      "begin_line": 461,
      "end_line": 471,
      "comment": "\n     * Tests isUrlSafe.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 56)",
        "(line 464,col 9)-(line 464,col 54)",
        "(line 466,col 9)-(line 466,col 74)",
        "(line 467,col 9)-(line 467,col 71)",
        "(line 469,col 9)-(line 469,col 60)",
        "(line 470,col 9)-(line 470,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownDecodings()",
      "begin_line": 473,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 476,col 109)",
        "(line 477,col 9)-(line 478,col 117)",
        "(line 479,col 9)-(line 480,col 113)",
        "(line 481,col 9)-(line 482,col 117)",
        "(line 483,col 9)-(line 484,col 120)",
        "(line 485,col 9)-(line 485,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownEncodings()",
      "begin_line": 488,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 491,col 111)",
        "(line 492,col 9)-(line 496,col 59)",
        "(line 497,col 9)-(line 498,col 117)",
        "(line 499,col 9)-(line 500,col 110)",
        "(line 501,col 9)-(line 502,col 117)",
        "(line 503,col 9)-(line 504,col 108)",
        "(line 505,col 9)-(line 505,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testNonBase64Test()",
      "begin_line": 508,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 38)",
        "(line 513,col 9)-(line 514,col 41)",
        "(line 516,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithInvalidParameter()",
      "begin_line": 529,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 40)",
        "(line 533,col 9)-(line 538,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithValidParameter()",
      "begin_line": 542,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 47)",
        "(line 546,col 9)-(line 546,col 78)",
        "(line 548,col 9)-(line 548,col 40)",
        "(line 549,col 9)-(line 549,col 46)",
        "(line 550,col 9)-(line 550,col 51)",
        "(line 551,col 9)-(line 551,col 50)",
        "(line 553,col 9)-(line 553,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithInvalidParameter()",
      "begin_line": 556,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 40)",
        "(line 559,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithValidParameter()",
      "begin_line": 567,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 47)",
        "(line 571,col 9)-(line 571,col 63)",
        "(line 573,col 9)-(line 573,col 40)",
        "(line 574,col 9)-(line 574,col 52)",
        "(line 575,col 9)-(line 575,col 69)",
        "(line 576,col 9)-(line 576,col 47)",
        "(line 578,col 9)-(line 578,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncode()",
      "begin_line": 581,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testPairs()",
      "begin_line": 587,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 83)",
        "(line 590,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section2Dot1CrLfDefinition()",
      "begin_line": 599,
      "end_line": 602,
      "comment": "\n     * Tests RFC 2045 section 2.1 CRLF definition.\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section6Dot8ChunkSizeDefinition()",
      "begin_line": 607,
      "end_line": 610,
      "comment": "\n     * Tests RFC 2045 section 6.8 chuck size definition.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc1421Section6Dot8ChunkSizeDefinition()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\n     * Tests RFC 1421 section 4.3.2.4 chuck size definition.\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Decode()",
      "begin_line": 635,
      "end_line": 644,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/\n     *      html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 80)",
        "(line 638,col 9)-(line 638,col 85)",
        "(line 639,col 9)-(line 639,col 86)",
        "(line 640,col 9)-(line 640,col 87)",
        "(line 641,col 9)-(line 641,col 92)",
        "(line 642,col 9)-(line 642,col 93)",
        "(line 643,col 9)-(line 643,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeWithCrLf()",
      "begin_line": 661,
      "end_line": 671,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/\n     *      html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 81)",
        "(line 664,col 9)-(line 664,col 87)",
        "(line 665,col 9)-(line 665,col 92)",
        "(line 666,col 9)-(line 666,col 93)",
        "(line 667,col 9)-(line 667,col 94)",
        "(line 668,col 9)-(line 668,col 99)",
        "(line 669,col 9)-(line 669,col 100)",
        "(line 670,col 9)-(line 670,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Encode()",
      "begin_line": 688,
      "end_line": 697,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/\n     *      html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 82)",
        "(line 691,col 9)-(line 691,col 87)",
        "(line 692,col 9)-(line 692,col 88)",
        "(line 693,col 9)-(line 693,col 89)",
        "(line 694,col 9)-(line 694,col 94)",
        "(line 695,col 9)-(line 695,col 95)",
        "(line 696,col 9)-(line 696,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeEncode()",
      "begin_line": 714,
      "end_line": 723,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/\n     *      html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 29)",
        "(line 717,col 9)-(line 717,col 33)",
        "(line 718,col 9)-(line 718,col 33)",
        "(line 719,col 9)-(line 719,col 33)",
        "(line 720,col 9)-(line 720,col 37)",
        "(line 721,col 9)-(line 721,col 37)",
        "(line 722,col 9)-(line 722,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeEncode(java.lang.String)",
      "begin_line": 725,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 98)",
        "(line 727,col 9)-(line 727,col 101)",
        "(line 728,col 9)-(line 728,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10EncodeDecode()",
      "begin_line": 746,
      "end_line": 755,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/\n     *      html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 29)",
        "(line 749,col 9)-(line 749,col 30)",
        "(line 750,col 9)-(line 750,col 31)",
        "(line 751,col 9)-(line 751,col 32)",
        "(line 752,col 9)-(line 752,col 33)",
        "(line 753,col 9)-(line 753,col 34)",
        "(line 754,col 9)-(line 754,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecode(java.lang.String)",
      "begin_line": 757,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 98)",
        "(line 759,col 9)-(line 759,col 98)",
        "(line 760,col 9)-(line 760,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletons()",
      "begin_line": 763,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 87)",
        "(line 766,col 9)-(line 766,col 87)",
        "(line 767,col 9)-(line 767,col 87)",
        "(line 768,col 9)-(line 768,col 87)",
        "(line 769,col 9)-(line 769,col 87)",
        "(line 770,col 9)-(line 770,col 87)",
        "(line 771,col 9)-(line 771,col 87)",
        "(line 772,col 9)-(line 772,col 87)",
        "(line 773,col 9)-(line 773,col 87)",
        "(line 774,col 9)-(line 774,col 87)",
        "(line 775,col 9)-(line 775,col 88)",
        "(line 776,col 9)-(line 776,col 88)",
        "(line 777,col 9)-(line 777,col 88)",
        "(line 778,col 9)-(line 778,col 88)",
        "(line 779,col 9)-(line 779,col 88)",
        "(line 780,col 9)-(line 780,col 88)",
        "(line 781,col 9)-(line 781,col 88)",
        "(line 782,col 9)-(line 782,col 88)",
        "(line 783,col 9)-(line 783,col 88)",
        "(line 784,col 9)-(line 784,col 88)",
        "(line 785,col 9)-(line 785,col 88)",
        "(line 786,col 9)-(line 786,col 88)",
        "(line 787,col 9)-(line 787,col 88)",
        "(line 788,col 9)-(line 788,col 88)",
        "(line 789,col 9)-(line 789,col 88)",
        "(line 790,col 9)-(line 790,col 88)",
        "(line 791,col 9)-(line 791,col 88)",
        "(line 792,col 9)-(line 792,col 88)",
        "(line 793,col 9)-(line 793,col 88)",
        "(line 794,col 9)-(line 794,col 88)",
        "(line 795,col 9)-(line 795,col 88)",
        "(line 796,col 9)-(line 796,col 88)",
        "(line 797,col 9)-(line 797,col 88)",
        "(line 798,col 9)-(line 798,col 88)",
        "(line 799,col 9)-(line 799,col 88)",
        "(line 800,col 9)-(line 800,col 88)",
        "(line 801,col 9)-(line 801,col 88)",
        "(line 802,col 9)-(line 802,col 88)",
        "(line 803,col 9)-(line 803,col 88)",
        "(line 804,col 9)-(line 804,col 88)",
        "(line 805,col 9)-(line 805,col 88)",
        "(line 806,col 9)-(line 806,col 88)",
        "(line 807,col 9)-(line 807,col 88)",
        "(line 808,col 9)-(line 808,col 88)",
        "(line 809,col 9)-(line 809,col 88)",
        "(line 810,col 9)-(line 810,col 88)",
        "(line 811,col 9)-(line 811,col 88)",
        "(line 812,col 9)-(line 812,col 88)",
        "(line 813,col 9)-(line 813,col 88)",
        "(line 814,col 9)-(line 814,col 88)",
        "(line 815,col 9)-(line 815,col 88)",
        "(line 816,col 9)-(line 816,col 88)",
        "(line 817,col 9)-(line 817,col 88)",
        "(line 818,col 9)-(line 818,col 88)",
        "(line 819,col 9)-(line 819,col 88)",
        "(line 820,col 9)-(line 820,col 88)",
        "(line 821,col 9)-(line 821,col 88)",
        "(line 822,col 9)-(line 822,col 88)",
        "(line 823,col 9)-(line 823,col 88)",
        "(line 824,col 9)-(line 824,col 88)",
        "(line 825,col 9)-(line 825,col 88)",
        "(line 826,col 9)-(line 826,col 88)",
        "(line 827,col 9)-(line 827,col 88)",
        "(line 828,col 9)-(line 828,col 88)",
        "(line 829,col 9)-(line 829,col 88)",
        "(line 830,col 9)-(line 830,col 88)",
        "(line 831,col 9)-(line 831,col 88)",
        "(line 832,col 9)-(line 832,col 88)",
        "(line 833,col 9)-(line 833,col 88)",
        "(line 834,col 9)-(line 834,col 88)",
        "(line 835,col 9)-(line 835,col 88)",
        "(line 836,col 9)-(line 836,col 88)",
        "(line 837,col 9)-(line 837,col 88)",
        "(line 838,col 9)-(line 838,col 88)",
        "(line 839,col 9)-(line 839,col 88)",
        "(line 840,col 9)-(line 840,col 88)",
        "(line 841,col 9)-(line 841,col 88)",
        "(line 842,col 9)-(line 842,col 88)",
        "(line 843,col 9)-(line 843,col 88)",
        "(line 844,col 9)-(line 844,col 88)",
        "(line 845,col 9)-(line 845,col 88)",
        "(line 846,col 9)-(line 846,col 88)",
        "(line 847,col 9)-(line 847,col 88)",
        "(line 848,col 9)-(line 848,col 88)",
        "(line 849,col 9)-(line 849,col 88)",
        "(line 850,col 9)-(line 850,col 88)",
        "(line 851,col 9)-(line 851,col 88)",
        "(line 852,col 9)-(line 852,col 88)",
        "(line 853,col 9)-(line 853,col 88)",
        "(line 854,col 9)-(line 854,col 88)",
        "(line 855,col 9)-(line 855,col 88)",
        "(line 856,col 9)-(line 856,col 88)",
        "(line 857,col 9)-(line 857,col 88)",
        "(line 858,col 9)-(line 858,col 88)",
        "(line 859,col 9)-(line 859,col 88)",
        "(line 860,col 9)-(line 860,col 88)",
        "(line 861,col 9)-(line 861,col 88)",
        "(line 862,col 9)-(line 862,col 88)",
        "(line 863,col 9)-(line 863,col 88)",
        "(line 864,col 9)-(line 864,col 88)",
        "(line 865,col 9)-(line 865,col 89)",
        "(line 866,col 9)-(line 866,col 89)",
        "(line 867,col 9)-(line 867,col 89)",
        "(line 868,col 9)-(line 868,col 89)",
        "(line 869,col 9)-(line 869,col 89)",
        "(line 870,col 9)-(line 873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletonsChunked()",
      "begin_line": 876,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 98)",
        "(line 879,col 9)-(line 879,col 98)",
        "(line 880,col 9)-(line 880,col 98)",
        "(line 881,col 9)-(line 881,col 98)",
        "(line 882,col 9)-(line 882,col 98)",
        "(line 883,col 9)-(line 883,col 98)",
        "(line 884,col 9)-(line 884,col 98)",
        "(line 885,col 9)-(line 885,col 98)",
        "(line 886,col 9)-(line 886,col 98)",
        "(line 887,col 9)-(line 887,col 98)",
        "(line 888,col 9)-(line 888,col 99)",
        "(line 889,col 9)-(line 889,col 99)",
        "(line 890,col 9)-(line 890,col 99)",
        "(line 891,col 9)-(line 891,col 99)",
        "(line 892,col 9)-(line 892,col 99)",
        "(line 893,col 9)-(line 893,col 99)",
        "(line 894,col 9)-(line 894,col 99)",
        "(line 895,col 9)-(line 895,col 99)",
        "(line 896,col 9)-(line 896,col 99)",
        "(line 897,col 9)-(line 897,col 99)",
        "(line 898,col 9)-(line 898,col 99)",
        "(line 899,col 9)-(line 899,col 99)",
        "(line 900,col 9)-(line 900,col 99)",
        "(line 901,col 9)-(line 901,col 99)",
        "(line 902,col 9)-(line 902,col 99)",
        "(line 903,col 9)-(line 903,col 99)",
        "(line 904,col 9)-(line 904,col 99)",
        "(line 905,col 9)-(line 905,col 99)",
        "(line 906,col 9)-(line 906,col 99)",
        "(line 907,col 9)-(line 907,col 99)",
        "(line 908,col 9)-(line 908,col 99)",
        "(line 909,col 9)-(line 909,col 99)",
        "(line 910,col 9)-(line 910,col 99)",
        "(line 911,col 9)-(line 911,col 99)",
        "(line 912,col 9)-(line 912,col 99)",
        "(line 913,col 9)-(line 913,col 99)",
        "(line 914,col 9)-(line 914,col 99)",
        "(line 915,col 9)-(line 915,col 99)",
        "(line 916,col 9)-(line 916,col 99)",
        "(line 917,col 9)-(line 917,col 99)",
        "(line 918,col 9)-(line 918,col 99)",
        "(line 919,col 9)-(line 919,col 99)",
        "(line 920,col 9)-(line 920,col 99)",
        "(line 921,col 9)-(line 921,col 99)",
        "(line 922,col 9)-(line 922,col 99)",
        "(line 923,col 9)-(line 923,col 99)",
        "(line 924,col 9)-(line 924,col 99)",
        "(line 925,col 9)-(line 925,col 99)",
        "(line 926,col 9)-(line 926,col 99)",
        "(line 927,col 9)-(line 927,col 99)",
        "(line 928,col 9)-(line 928,col 99)",
        "(line 929,col 9)-(line 929,col 99)",
        "(line 930,col 9)-(line 930,col 99)",
        "(line 931,col 9)-(line 931,col 99)",
        "(line 932,col 9)-(line 932,col 99)",
        "(line 933,col 9)-(line 933,col 99)",
        "(line 934,col 9)-(line 934,col 99)",
        "(line 935,col 9)-(line 935,col 99)",
        "(line 936,col 9)-(line 936,col 99)",
        "(line 937,col 9)-(line 937,col 99)",
        "(line 938,col 9)-(line 938,col 99)",
        "(line 939,col 9)-(line 939,col 99)",
        "(line 940,col 9)-(line 940,col 99)",
        "(line 941,col 9)-(line 941,col 99)",
        "(line 942,col 9)-(line 942,col 99)",
        "(line 943,col 9)-(line 943,col 99)",
        "(line 944,col 9)-(line 944,col 99)",
        "(line 945,col 9)-(line 945,col 99)",
        "(line 946,col 9)-(line 946,col 99)",
        "(line 947,col 9)-(line 947,col 99)",
        "(line 948,col 9)-(line 948,col 99)",
        "(line 949,col 9)-(line 949,col 99)",
        "(line 950,col 9)-(line 950,col 99)",
        "(line 951,col 9)-(line 951,col 99)",
        "(line 952,col 9)-(line 952,col 99)",
        "(line 953,col 9)-(line 953,col 99)",
        "(line 954,col 9)-(line 954,col 99)",
        "(line 955,col 9)-(line 955,col 99)",
        "(line 956,col 9)-(line 956,col 99)",
        "(line 957,col 9)-(line 957,col 99)",
        "(line 958,col 9)-(line 958,col 99)",
        "(line 959,col 9)-(line 959,col 99)",
        "(line 960,col 9)-(line 960,col 99)",
        "(line 961,col 9)-(line 961,col 99)",
        "(line 962,col 9)-(line 962,col 99)",
        "(line 963,col 9)-(line 963,col 99)",
        "(line 964,col 9)-(line 964,col 99)",
        "(line 965,col 9)-(line 965,col 99)",
        "(line 966,col 9)-(line 966,col 99)",
        "(line 967,col 9)-(line 967,col 99)",
        "(line 968,col 9)-(line 968,col 99)",
        "(line 969,col 9)-(line 969,col 99)",
        "(line 970,col 9)-(line 970,col 99)",
        "(line 971,col 9)-(line 971,col 99)",
        "(line 972,col 9)-(line 972,col 99)",
        "(line 973,col 9)-(line 973,col 99)",
        "(line 974,col 9)-(line 974,col 99)",
        "(line 975,col 9)-(line 975,col 99)",
        "(line 976,col 9)-(line 976,col 99)",
        "(line 977,col 9)-(line 977,col 99)",
        "(line 978,col 9)-(line 978,col 100)",
        "(line 979,col 9)-(line 979,col 100)",
        "(line 980,col 9)-(line 980,col 100)",
        "(line 981,col 9)-(line 981,col 100)",
        "(line 982,col 9)-(line 982,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTriplets()",
      "begin_line": 985,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 107)",
        "(line 988,col 9)-(line 988,col 107)",
        "(line 989,col 9)-(line 989,col 107)",
        "(line 990,col 9)-(line 990,col 107)",
        "(line 991,col 9)-(line 991,col 107)",
        "(line 992,col 9)-(line 992,col 107)",
        "(line 993,col 9)-(line 993,col 107)",
        "(line 994,col 9)-(line 994,col 107)",
        "(line 995,col 9)-(line 995,col 107)",
        "(line 996,col 9)-(line 996,col 107)",
        "(line 997,col 9)-(line 997,col 108)",
        "(line 998,col 9)-(line 998,col 108)",
        "(line 999,col 9)-(line 999,col 108)",
        "(line 1000,col 9)-(line 1000,col 108)",
        "(line 1001,col 9)-(line 1001,col 108)",
        "(line 1002,col 9)-(line 1002,col 108)",
        "(line 1003,col 9)-(line 1003,col 108)",
        "(line 1004,col 9)-(line 1004,col 108)",
        "(line 1005,col 9)-(line 1005,col 108)",
        "(line 1006,col 9)-(line 1006,col 108)",
        "(line 1007,col 9)-(line 1007,col 108)",
        "(line 1008,col 9)-(line 1008,col 108)",
        "(line 1009,col 9)-(line 1009,col 108)",
        "(line 1010,col 9)-(line 1010,col 108)",
        "(line 1011,col 9)-(line 1011,col 108)",
        "(line 1012,col 9)-(line 1012,col 108)",
        "(line 1013,col 9)-(line 1013,col 108)",
        "(line 1014,col 9)-(line 1014,col 108)",
        "(line 1015,col 9)-(line 1015,col 108)",
        "(line 1016,col 9)-(line 1016,col 108)",
        "(line 1017,col 9)-(line 1017,col 108)",
        "(line 1018,col 9)-(line 1018,col 108)",
        "(line 1019,col 9)-(line 1019,col 108)",
        "(line 1020,col 9)-(line 1020,col 108)",
        "(line 1021,col 9)-(line 1021,col 108)",
        "(line 1022,col 9)-(line 1022,col 108)",
        "(line 1023,col 9)-(line 1023,col 108)",
        "(line 1024,col 9)-(line 1024,col 108)",
        "(line 1025,col 9)-(line 1025,col 108)",
        "(line 1026,col 9)-(line 1026,col 108)",
        "(line 1027,col 9)-(line 1027,col 108)",
        "(line 1028,col 9)-(line 1028,col 108)",
        "(line 1029,col 9)-(line 1029,col 108)",
        "(line 1030,col 9)-(line 1030,col 108)",
        "(line 1031,col 9)-(line 1031,col 108)",
        "(line 1032,col 9)-(line 1032,col 108)",
        "(line 1033,col 9)-(line 1033,col 108)",
        "(line 1034,col 9)-(line 1034,col 108)",
        "(line 1035,col 9)-(line 1035,col 108)",
        "(line 1036,col 9)-(line 1036,col 108)",
        "(line 1037,col 9)-(line 1037,col 108)",
        "(line 1038,col 9)-(line 1038,col 108)",
        "(line 1039,col 9)-(line 1039,col 108)",
        "(line 1040,col 9)-(line 1040,col 108)",
        "(line 1041,col 9)-(line 1041,col 108)",
        "(line 1042,col 9)-(line 1042,col 108)",
        "(line 1043,col 9)-(line 1043,col 108)",
        "(line 1044,col 9)-(line 1044,col 108)",
        "(line 1045,col 9)-(line 1045,col 108)",
        "(line 1046,col 9)-(line 1046,col 108)",
        "(line 1047,col 9)-(line 1047,col 108)",
        "(line 1048,col 9)-(line 1048,col 108)",
        "(line 1049,col 9)-(line 1049,col 108)",
        "(line 1050,col 9)-(line 1050,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTripletsChunked()",
      "begin_line": 1053,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 118)",
        "(line 1056,col 9)-(line 1056,col 118)",
        "(line 1057,col 9)-(line 1057,col 118)",
        "(line 1058,col 9)-(line 1058,col 118)",
        "(line 1059,col 9)-(line 1059,col 118)",
        "(line 1060,col 9)-(line 1060,col 118)",
        "(line 1061,col 9)-(line 1061,col 118)",
        "(line 1062,col 9)-(line 1062,col 118)",
        "(line 1063,col 9)-(line 1063,col 118)",
        "(line 1064,col 9)-(line 1064,col 118)",
        "(line 1065,col 9)-(line 1065,col 119)",
        "(line 1066,col 9)-(line 1066,col 119)",
        "(line 1067,col 9)-(line 1067,col 119)",
        "(line 1068,col 9)-(line 1068,col 119)",
        "(line 1069,col 9)-(line 1069,col 119)",
        "(line 1070,col 9)-(line 1070,col 119)",
        "(line 1071,col 9)-(line 1071,col 119)",
        "(line 1072,col 9)-(line 1072,col 119)",
        "(line 1073,col 9)-(line 1073,col 119)",
        "(line 1074,col 9)-(line 1074,col 119)",
        "(line 1075,col 9)-(line 1075,col 119)",
        "(line 1076,col 9)-(line 1076,col 119)",
        "(line 1077,col 9)-(line 1077,col 119)",
        "(line 1078,col 9)-(line 1078,col 119)",
        "(line 1079,col 9)-(line 1079,col 119)",
        "(line 1080,col 9)-(line 1080,col 119)",
        "(line 1081,col 9)-(line 1081,col 119)",
        "(line 1082,col 9)-(line 1082,col 119)",
        "(line 1083,col 9)-(line 1083,col 119)",
        "(line 1084,col 9)-(line 1084,col 119)",
        "(line 1085,col 9)-(line 1085,col 119)",
        "(line 1086,col 9)-(line 1086,col 119)",
        "(line 1087,col 9)-(line 1087,col 119)",
        "(line 1088,col 9)-(line 1088,col 119)",
        "(line 1089,col 9)-(line 1089,col 119)",
        "(line 1090,col 9)-(line 1090,col 119)",
        "(line 1091,col 9)-(line 1091,col 119)",
        "(line 1092,col 9)-(line 1092,col 119)",
        "(line 1093,col 9)-(line 1093,col 119)",
        "(line 1094,col 9)-(line 1094,col 119)",
        "(line 1095,col 9)-(line 1095,col 119)",
        "(line 1096,col 9)-(line 1096,col 119)",
        "(line 1097,col 9)-(line 1097,col 119)",
        "(line 1098,col 9)-(line 1098,col 119)",
        "(line 1099,col 9)-(line 1099,col 119)",
        "(line 1100,col 9)-(line 1100,col 119)",
        "(line 1101,col 9)-(line 1101,col 119)",
        "(line 1102,col 9)-(line 1102,col 119)",
        "(line 1103,col 9)-(line 1103,col 119)",
        "(line 1104,col 9)-(line 1104,col 119)",
        "(line 1105,col 9)-(line 1105,col 119)",
        "(line 1106,col 9)-(line 1106,col 119)",
        "(line 1107,col 9)-(line 1107,col 119)",
        "(line 1108,col 9)-(line 1108,col 119)",
        "(line 1109,col 9)-(line 1109,col 119)",
        "(line 1110,col 9)-(line 1110,col 119)",
        "(line 1111,col 9)-(line 1111,col 119)",
        "(line 1112,col 9)-(line 1112,col 119)",
        "(line 1113,col 9)-(line 1113,col 119)",
        "(line 1114,col 9)-(line 1114,col 119)",
        "(line 1115,col 9)-(line 1115,col 119)",
        "(line 1116,col 9)-(line 1116,col 119)",
        "(line 1117,col 9)-(line 1117,col 119)",
        "(line 1118,col 9)-(line 1118,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUrlSafe()",
      "begin_line": 1124,
      "end_line": 1138,
      "comment": "\n     * Tests url-safe Base64 against random data, sizes 0 to 150.\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUUID()",
      "begin_line": 1148,
      "end_line": 1223,
      "comment": "\n     * Base64 encoding of UUID\u0027s is a common use-case, especially in URL-SAFE\n     * mode. This test case ends up being the \"URL-SAFE\" JUnit\u0027s.\n     *\n     * @throws DecoderException\n     *             if Hex.decode() fails - a serious problem since Hex comes\n     *             from our own commons-codec!\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 43)",
        "(line 1155,col 9)-(line 1155,col 67)",
        "(line 1158,col 9)-(line 1158,col 67)",
        "(line 1161,col 9)-(line 1161,col 67)",
        "(line 1165,col 9)-(line 1165,col 67)",
        "(line 1167,col 9)-(line 1167,col 48)",
        "(line 1168,col 9)-(line 1168,col 75)",
        "(line 1169,col 9)-(line 1169,col 75)",
        "(line 1170,col 9)-(line 1170,col 75)",
        "(line 1171,col 9)-(line 1171,col 75)",
        "(line 1173,col 9)-(line 1173,col 48)",
        "(line 1175,col 9)-(line 1175,col 75)",
        "(line 1176,col 9)-(line 1176,col 75)",
        "(line 1177,col 9)-(line 1177,col 75)",
        "(line 1178,col 9)-(line 1178,col 75)",
        "(line 1180,col 9)-(line 1180,col 48)",
        "(line 1182,col 9)-(line 1182,col 74)",
        "(line 1183,col 9)-(line 1183,col 74)",
        "(line 1184,col 9)-(line 1184,col 74)",
        "(line 1185,col 9)-(line 1185,col 74)",
        "(line 1187,col 9)-(line 1187,col 48)",
        "(line 1189,col 9)-(line 1189,col 73)",
        "(line 1190,col 9)-(line 1190,col 73)",
        "(line 1191,col 9)-(line 1191,col 73)",
        "(line 1192,col 9)-(line 1192,col 73)",
        "(line 1194,col 9)-(line 1222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testByteToStringVariations()",
      "begin_line": 1225,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 44)",
        "(line 1228,col 9)-(line 1228,col 66)",
        "(line 1229,col 9)-(line 1229,col 38)",
        "(line 1230,col 9)-(line 1230,col 31)",
        "(line 1231,col 9)-(line 1231,col 76)",
        "(line 1235,col 9)-(line 1235,col 96)",
        "(line 1236,col 9)-(line 1236,col 107)",
        "(line 1237,col 9)-(line 1237,col 73)",
        "(line 1238,col 9)-(line 1238,col 84)",
        "(line 1239,col 9)-(line 1239,col 75)",
        "(line 1240,col 9)-(line 1240,col 86)",
        "(line 1241,col 9)-(line 1241,col 97)",
        "(line 1242,col 9)-(line 1242,col 108)",
        "(line 1243,col 9)-(line 1244,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testStringToByteVariations()",
      "begin_line": 1247,
      "end_line": 1271,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 43)",
        "(line 1250,col 9)-(line 1250,col 49)",
        "(line 1251,col 9)-(line 1251,col 29)",
        "(line 1252,col 9)-(line 1252,col 31)",
        "(line 1253,col 9)-(line 1253,col 58)",
        "(line 1254,col 9)-(line 1254,col 52)",
        "(line 1255,col 9)-(line 1255,col 76)",
        "(line 1259,col 9)-(line 1259,col 110)",
        "(line 1260,col 9)-(line 1261,col 80)",
        "(line 1262,col 9)-(line 1263,col 68)",
        "(line 1264,col 9)-(line 1264,col 92)",
        "(line 1265,col 9)-(line 1265,col 105)",
        "(line 1266,col 9)-(line 1266,col 94)",
        "(line 1267,col 9)-(line 1267,col 107)",
        "(line 1268,col 9)-(line 1268,col 79)",
        "(line 1269,col 9)-(line 1269,col 92)",
        "(line 1270,col 9)-(line 1270,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.toString(byte[])",
      "begin_line": 1273,
      "end_line": 1282,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 54)",
        "(line 1275,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1281,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testHugeLineSeparator()",
      "begin_line": 1289,
      "end_line": 1299,
      "comment": "\n     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.\n     *\n     * @see \"\u003ca href\u003d\u0027http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E\u0027\u003edev@commons.apache.org\u003c/a\u003e\"\n     ",
      "child_ranges": [
        "(line 1292,col 9)-(line 1292,col 56)",
        "(line 1293,col 9)-(line 1293,col 53)",
        "(line 1294,col 9)-(line 1294,col 88)",
        "(line 1295,col 9)-(line 1295,col 87)",
        "(line 1296,col 9)-(line 1296,col 49)",
        "(line 1297,col 9)-(line 1297,col 108)",
        "(line 1298,col 9)-(line 1298,col 73)"
      ]
    }
  ]
}