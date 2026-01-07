{
  "filepath": "/tmp/Codec-12b/src/test/java/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 554,
      "comment": "\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_B64"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Decodes to {0, 0, 0, 255, 255, 255}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec130()",
      "begin_line": 57,
      "end_line": 74,
      "comment": "\n     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 64)",
        "(line 60,col 9)-(line 60,col 66)",
        "(line 62,col 9)-(line 62,col 65)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 65,col 9)-(line 65,col 79)",
        "(line 66,col 9)-(line 66,col 59)",
        "(line 69,col 9)-(line 69,col 20)",
        "(line 70,col 9)-(line 70,col 78)",
        "(line 71,col 9)-(line 71,col 61)",
        "(line 73,col 9)-(line 73,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec105()",
      "begin_line": 79,
      "end_line": 89,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 100)",
        "(line 82,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 97,
      "end_line": 108,
      "comment": "\n     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java\u0027s builtin InputStreamReader hates that.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 91)",
        "(line 100,col 9)-(line 100,col 71)",
        "(line 101,col 9)-(line 101,col 59)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 104,col 75)",
        "(line 106,col 9)-(line 106,col 28)",
        "(line 107,col 9)-(line 107,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader()",
      "begin_line": 125,
      "end_line": 134,
      "comment": "\n     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an\n     * InputStream.read(byte[]) return of 0:\n     * \n     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at\n     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at\n     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at\n     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at\n     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)\n     * \n     * But in commons-codec-1.5 it\u0027s fixed. :-)\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 91)",
        "(line 128,col 9)-(line 128,col 71)",
        "(line 129,col 9)-(line 129,col 59)",
        "(line 130,col 9)-(line 130,col 58)",
        "(line 131,col 9)-(line 131,col 52)",
        "(line 132,col 9)-(line 132,col 36)",
        "(line 133,col 9)-(line 133,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 142,
      "end_line": 153,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 79)",
        "(line 145,col 9)-(line 145,col 70)",
        "(line 146,col 9)-(line 146,col 63)",
        "(line 149,col 9)-(line 149,col 83)",
        "(line 151,col 9)-(line 151,col 65)",
        "(line 152,col 9)-(line 152,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testAvailable()",
      "begin_line": 160,
      "end_line": 171,
      "comment": "\n     * Tests skipping past the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 95)",
        "(line 163,col 9)-(line 163,col 65)",
        "(line 164,col 9)-(line 164,col 47)",
        "(line 165,col 9)-(line 165,col 44)",
        "(line 167,col 9)-(line 167,col 47)",
        "(line 168,col 9)-(line 168,col 43)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 195,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 42)",
        "(line 197,col 9)-(line 197,col 42)",
        "(line 198,col 9)-(line 198,col 68)",
        "(line 199,col 9)-(line 199,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 208,
      "end_line": 238,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 74)",
        "(line 212,col 9)-(line 212,col 66)",
        "(line 213,col 9)-(line 213,col 72)",
        "(line 216,col 9)-(line 216,col 55)",
        "(line 217,col 9)-(line 217,col 42)",
        "(line 218,col 9)-(line 218,col 72)",
        "(line 221,col 9)-(line 221,col 85)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 223,col 9)-(line 223,col 69)",
        "(line 226,col 9)-(line 226,col 90)",
        "(line 227,col 9)-(line 227,col 55)",
        "(line 228,col 9)-(line 228,col 41)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 232,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 246,
      "end_line": 276,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 74)",
        "(line 250,col 9)-(line 250,col 66)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 254,col 9)-(line 254,col 55)",
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 75)",
        "(line 259,col 9)-(line 259,col 85)",
        "(line 260,col 9)-(line 260,col 41)",
        "(line 261,col 9)-(line 261,col 72)",
        "(line 264,col 9)-(line 264,col 90)",
        "(line 265,col 9)-(line 265,col 55)",
        "(line 266,col 9)-(line 266,col 41)",
        "(line 267,col 9)-(line 267,col 48)",
        "(line 270,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 296,
      "end_line": 327,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 59)",
        "(line 300,col 9)-(line 300,col 67)",
        "(line 301,col 9)-(line 301,col 57)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 305,col 78)",
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 50)",
        "(line 312,col 9)-(line 312,col 43)",
        "(line 313,col 9)-(line 313,col 49)",
        "(line 314,col 9)-(line 314,col 78)",
        "(line 317,col 9)-(line 317,col 47)",
        "(line 318,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 50)",
        "(line 324,col 9)-(line 324,col 43)",
        "(line 325,col 9)-(line 325,col 49)",
        "(line 326,col 9)-(line 326,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 347,
      "end_line": 387,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 59)",
        "(line 351,col 9)-(line 351,col 67)",
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 43)",
        "(line 358,col 9)-(line 358,col 49)",
        "(line 359,col 9)-(line 359,col 78)",
        "(line 362,col 9)-(line 362,col 47)",
        "(line 363,col 9)-(line 363,col 39)",
        "(line 364,col 9)-(line 364,col 42)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 43)",
        "(line 370,col 9)-(line 370,col 49)",
        "(line 371,col 9)-(line 371,col 78)",
        "(line 374,col 9)-(line 374,col 47)",
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 42)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 43)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 66)",
        "(line 397,col 9)-(line 397,col 69)",
        "(line 398,col 9)-(line 398,col 91)",
        "(line 400,col 9)-(line 400,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 408,
      "end_line": 417,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 66)",
        "(line 411,col 9)-(line 411,col 36)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 69)",
        "(line 414,col 9)-(line 414,col 91)",
        "(line 415,col 9)-(line 415,col 39)",
        "(line 416,col 9)-(line 416,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 425,
      "end_line": 436,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 66)",
        "(line 428,col 9)-(line 428,col 69)",
        "(line 429,col 9)-(line 429,col 91)",
        "(line 430,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 443,
      "end_line": 477,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 66)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 69)",
        "(line 448,col 9)-(line 448,col 91)",
        "(line 450,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipBig()",
      "begin_line": 484,
      "end_line": 492,
      "comment": "\n     * Tests skipping number of characters larger than the internal buffer.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 95)",
        "(line 487,col 9)-(line 487,col 65)",
        "(line 488,col 9)-(line 488,col 46)",
        "(line 490,col 9)-(line 490,col 43)",
        "(line 491,col 9)-(line 491,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipNone()",
      "begin_line": 499,
      "end_line": 509,
      "comment": "\n     * Tests skipping as a noop\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 95)",
        "(line 502,col 9)-(line 502,col 65)",
        "(line 503,col 9)-(line 503,col 41)",
        "(line 504,col 9)-(line 504,col 43)",
        "(line 505,col 9)-(line 505,col 59)",
        "(line 506,col 9)-(line 506,col 99)",
        "(line 508,col 9)-(line 508,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipPastEnd()",
      "begin_line": 516,
      "end_line": 525,
      "comment": "\n     * Tests skipping past the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 95)",
        "(line 519,col 9)-(line 519,col 65)",
        "(line 521,col 9)-(line 521,col 44)",
        "(line 523,col 9)-(line 523,col 43)",
        "(line 524,col 9)-(line 524,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipToEnd()",
      "begin_line": 532,
      "end_line": 541,
      "comment": "\n     * Tests skipping to the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 95)",
        "(line 535,col 9)-(line 535,col 65)",
        "(line 537,col 9)-(line 537,col 43)",
        "(line 539,col 9)-(line 539,col 43)",
        "(line 540,col 9)-(line 540,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipWrongArgument()",
      "begin_line": 548,
      "end_line": 553,
      "comment": "\n     * Tests if negative arguments to skip are handled correctly.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 95)",
        "(line 551,col 9)-(line 551,col 65)",
        "(line 552,col 9)-(line 552,col 28)"
      ]
    }
  ]
}