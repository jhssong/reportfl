{
  "filepath": "/tmp/Codec-12b/src/test/java/org/apache/commons/codec/binary/Base32InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_FOO"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testCodec130()",
      "begin_line": 47,
      "end_line": 64,
      "comment": "\n     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 64)",
        "(line 50,col 9)-(line 50,col 66)",
        "(line 52,col 9)-(line 52,col 65)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 55,col 9)-(line 55,col 79)",
        "(line 56,col 9)-(line 56,col 59)",
        "(line 59,col 9)-(line 59,col 20)",
        "(line 60,col 9)-(line 60,col 78)",
        "(line 61,col 9)-(line 61,col 61)",
        "(line 63,col 9)-(line 63,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testCodec105()",
      "begin_line": 69,
      "end_line": 79,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 100)",
        "(line 72,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testAvailable()",
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n     * Tests skipping past the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 95)",
        "(line 155,col 9)-(line 155,col 65)",
        "(line 156,col 9)-(line 156,col 47)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 162,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamMimeChuckSize()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamPemChuckSize()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStream(int)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 42)",
        "(line 190,col 9)-(line 190,col 68)",
        "(line 191,col 9)-(line 191,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByChunk()",
      "begin_line": 200,
      "end_line": 231,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 81)",
        "(line 204,col 9)-(line 204,col 81)",
        "(line 205,col 9)-(line 205,col 72)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 42)",
        "(line 210,col 9)-(line 210,col 72)",
        "(line 224,col 9)-(line 224,col 40)",
        "(line 225,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByteByByte()",
      "begin_line": 239,
      "end_line": 265,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 81)",
        "(line 243,col 9)-(line 243,col 81)",
        "(line 244,col 9)-(line 244,col 75)",
        "(line 247,col 9)-(line 247,col 59)",
        "(line 248,col 9)-(line 248,col 42)",
        "(line 249,col 9)-(line 249,col 75)",
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 285,
      "end_line": 316,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 59)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 57)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 49)",
        "(line 294,col 9)-(line 294,col 78)",
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 39)",
        "(line 299,col 9)-(line 299,col 50)",
        "(line 301,col 9)-(line 301,col 43)",
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 303,col 78)",
        "(line 306,col 9)-(line 306,col 47)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 50)",
        "(line 313,col 9)-(line 313,col 43)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 336,
      "end_line": 376,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 59)",
        "(line 340,col 9)-(line 340,col 67)",
        "(line 341,col 9)-(line 341,col 49)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 43)",
        "(line 347,col 9)-(line 347,col 49)",
        "(line 348,col 9)-(line 348,col 78)",
        "(line 351,col 9)-(line 351,col 47)",
        "(line 352,col 9)-(line 352,col 39)",
        "(line 353,col 9)-(line 353,col 42)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 43)",
        "(line 359,col 9)-(line 359,col 49)",
        "(line 360,col 9)-(line 360,col 78)",
        "(line 363,col 9)-(line 363,col 47)",
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 42)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 43)",
        "(line 374,col 9)-(line 374,col 49)",
        "(line 375,col 9)-(line 375,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testMarkSupported()",
      "begin_line": 383,
      "end_line": 390,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 81)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 91)",
        "(line 389,col 9)-(line 389,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testRead0()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 81)",
        "(line 400,col 9)-(line 400,col 36)",
        "(line 401,col 9)-(line 401,col 26)",
        "(line 402,col 9)-(line 402,col 69)",
        "(line 403,col 9)-(line 403,col 91)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadNull()",
      "begin_line": 414,
      "end_line": 425,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 81)",
        "(line 417,col 9)-(line 417,col 69)",
        "(line 418,col 9)-(line 418,col 91)",
        "(line 419,col 9)-(line 424,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadOutOfBounds()",
      "begin_line": 432,
      "end_line": 466,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 81)",
        "(line 435,col 9)-(line 435,col 36)",
        "(line 436,col 9)-(line 436,col 69)",
        "(line 437,col 9)-(line 437,col 91)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipNone()",
      "begin_line": 473,
      "end_line": 483,
      "comment": "\n     * Tests skipping as a noop\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 95)",
        "(line 476,col 9)-(line 476,col 65)",
        "(line 477,col 9)-(line 477,col 41)",
        "(line 478,col 9)-(line 478,col 43)",
        "(line 479,col 9)-(line 479,col 59)",
        "(line 480,col 9)-(line 480,col 78)",
        "(line 482,col 9)-(line 482,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipBig()",
      "begin_line": 490,
      "end_line": 498,
      "comment": "\n     * Tests skipping number of characters larger than the internal buffer.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 95)",
        "(line 493,col 9)-(line 493,col 65)",
        "(line 494,col 9)-(line 494,col 46)",
        "(line 496,col 9)-(line 496,col 43)",
        "(line 497,col 9)-(line 497,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipPastEnd()",
      "begin_line": 505,
      "end_line": 514,
      "comment": "\n     * Tests skipping past the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 95)",
        "(line 508,col 9)-(line 508,col 65)",
        "(line 510,col 9)-(line 510,col 44)",
        "(line 512,col 9)-(line 512,col 43)",
        "(line 513,col 9)-(line 513,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipToEnd()",
      "begin_line": 521,
      "end_line": 530,
      "comment": "\n     * Tests skipping to the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 95)",
        "(line 524,col 9)-(line 524,col 65)",
        "(line 526,col 9)-(line 526,col 43)",
        "(line 528,col 9)-(line 528,col 43)",
        "(line 529,col 9)-(line 529,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipWrongArgument()",
      "begin_line": 537,
      "end_line": 542,
      "comment": "\n     * Tests if negative arguments to skip are handled correctly.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 95)",
        "(line 540,col 9)-(line 540,col 65)",
        "(line 541,col 9)-(line 541,col 28)"
      ]
    }
  ]
}