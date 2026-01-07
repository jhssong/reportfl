{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/Base32InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 557,
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
        "(line 49,col 9)-(line 49,col 70)",
        "(line 50,col 9)-(line 50,col 72)",
        "(line 52,col 9)-(line 52,col 65)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 55,col 9)-(line 55,col 85)",
        "(line 56,col 9)-(line 56,col 65)",
        "(line 59,col 9)-(line 59,col 20)",
        "(line 60,col 9)-(line 60,col 84)",
        "(line 61,col 9)-(line 61,col 67)",
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
        "(line 71,col 9)-(line 71,col 106)",
        "(line 72,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testAvailable()",
      "begin_line": 152,
      "end_line": 164,
      "comment": "\n     * Tests skipping past the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 101)",
        "(line 155,col 9)-(line 155,col 71)",
        "(line 156,col 9)-(line 156,col 47)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamMimeChuckSize()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamPemChuckSize()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStream(int)",
      "begin_line": 188,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 48)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 191,col 68)",
        "(line 192,col 9)-(line 192,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByChunk()",
      "begin_line": 201,
      "end_line": 232,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 81)",
        "(line 205,col 9)-(line 205,col 81)",
        "(line 206,col 9)-(line 206,col 72)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 42)",
        "(line 211,col 9)-(line 211,col 72)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByteByByte()",
      "begin_line": 240,
      "end_line": 266,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 81)",
        "(line 244,col 9)-(line 244,col 81)",
        "(line 245,col 9)-(line 245,col 75)",
        "(line 248,col 9)-(line 248,col 59)",
        "(line 249,col 9)-(line 249,col 42)",
        "(line 250,col 9)-(line 250,col 75)",
        "(line 259,col 9)-(line 259,col 46)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 286,
      "end_line": 318,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     *\n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param separator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 23)",
        "(line 291,col 9)-(line 291,col 98)",
        "(line 292,col 9)-(line 292,col 57)",
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 296,col 78)",
        "(line 299,col 9)-(line 299,col 70)",
        "(line 300,col 9)-(line 300,col 50)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 78)",
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 50)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 315,col 49)",
        "(line 316,col 9)-(line 316,col 87)",
        "(line 317,col 9)-(line 317,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 338,
      "end_line": 381,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     *\n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param separator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 23)",
        "(line 342,col 9)-(line 342,col 98)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 43)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 78)",
        "(line 352,col 9)-(line 352,col 19)",
        "(line 355,col 9)-(line 355,col 70)",
        "(line 356,col 9)-(line 356,col 42)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 363,col 9)-(line 363,col 78)",
        "(line 365,col 9)-(line 365,col 19)",
        "(line 368,col 9)-(line 368,col 47)",
        "(line 369,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 43)",
        "(line 379,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testMarkSupported()",
      "begin_line": 388,
      "end_line": 396,
      "comment": "\n     * Tests markSupported.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 87)",
        "(line 391,col 9)-(line 391,col 75)",
        "(line 392,col 9)-(line 392,col 97)",
        "(line 394,col 9)-(line 394,col 86)",
        "(line 395,col 9)-(line 395,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testRead0()",
      "begin_line": 403,
      "end_line": 413,
      "comment": "\n     * Tests read returning 0\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 87)",
        "(line 406,col 9)-(line 406,col 42)",
        "(line 407,col 9)-(line 407,col 26)",
        "(line 408,col 9)-(line 408,col 75)",
        "(line 409,col 9)-(line 409,col 97)",
        "(line 410,col 9)-(line 410,col 39)",
        "(line 411,col 9)-(line 411,col 82)",
        "(line 412,col 9)-(line 412,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadNull()",
      "begin_line": 421,
      "end_line": 433,
      "comment": "\n     * Tests read with null.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 87)",
        "(line 424,col 9)-(line 424,col 75)",
        "(line 425,col 9)-(line 425,col 97)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadOutOfBounds()",
      "begin_line": 440,
      "end_line": 475,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 87)",
        "(line 443,col 9)-(line 443,col 42)",
        "(line 444,col 9)-(line 444,col 75)",
        "(line 445,col 9)-(line 445,col 97)",
        "(line 447,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipNone()",
      "begin_line": 482,
      "end_line": 493,
      "comment": "\n     * Tests skipping as a noop\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 101)",
        "(line 485,col 9)-(line 485,col 71)",
        "(line 486,col 9)-(line 486,col 47)",
        "(line 487,col 9)-(line 487,col 43)",
        "(line 488,col 9)-(line 488,col 59)",
        "(line 489,col 9)-(line 489,col 78)",
        "(line 491,col 9)-(line 491,col 43)",
        "(line 492,col 9)-(line 492,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipBig()",
      "begin_line": 500,
      "end_line": 509,
      "comment": "\n     * Tests skipping number of characters larger than the internal buffer.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 101)",
        "(line 503,col 9)-(line 503,col 71)",
        "(line 504,col 9)-(line 504,col 46)",
        "(line 506,col 9)-(line 506,col 43)",
        "(line 507,col 9)-(line 507,col 43)",
        "(line 508,col 9)-(line 508,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipPastEnd()",
      "begin_line": 516,
      "end_line": 526,
      "comment": "\n     * Tests skipping past the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 101)",
        "(line 519,col 9)-(line 519,col 71)",
        "(line 521,col 9)-(line 521,col 44)",
        "(line 523,col 9)-(line 523,col 43)",
        "(line 524,col 9)-(line 524,col 43)",
        "(line 525,col 9)-(line 525,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipToEnd()",
      "begin_line": 533,
      "end_line": 543,
      "comment": "\n     * Tests skipping to the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 101)",
        "(line 536,col 9)-(line 536,col 71)",
        "(line 538,col 9)-(line 538,col 43)",
        "(line 540,col 9)-(line 540,col 43)",
        "(line 541,col 9)-(line 541,col 43)",
        "(line 542,col 9)-(line 542,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipWrongArgument()",
      "begin_line": 550,
      "end_line": 556,
      "comment": "\n     * Tests if negative arguments to skip are handled correctly.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 101)",
        "(line 553,col 9)-(line 553,col 71)",
        "(line 554,col 9)-(line 554,col 28)",
        "(line 555,col 9)-(line 555,col 26)"
      ]
    }
  ]
}