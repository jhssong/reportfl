{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 571,
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
        "(line 59,col 9)-(line 59,col 70)",
        "(line 60,col 9)-(line 60,col 72)",
        "(line 62,col 9)-(line 62,col 65)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 65,col 9)-(line 65,col 85)",
        "(line 66,col 9)-(line 66,col 65)",
        "(line 69,col 9)-(line 69,col 20)",
        "(line 70,col 9)-(line 70,col 84)",
        "(line 71,col 9)-(line 71,col 67)",
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
        "(line 81,col 9)-(line 81,col 106)",
        "(line 82,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java\u0027s builtin InputStreamReader hates that.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 97)",
        "(line 100,col 9)-(line 100,col 77)",
        "(line 101,col 9)-(line 101,col 65)",
        "(line 102,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 104,col 75)",
        "(line 106,col 9)-(line 106,col 28)",
        "(line 107,col 9)-(line 107,col 93)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader()",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an\n     * InputStream.read(byte[]) return of 0:\n     *\n     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at\n     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at\n     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at\n     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at\n     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)\n     *\n     * But in commons-codec-1.5 it\u0027s fixed. :-)\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 97)",
        "(line 129,col 9)-(line 129,col 77)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 64)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 42)",
        "(line 134,col 9)-(line 134,col 67)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 85)",
        "(line 147,col 9)-(line 147,col 76)",
        "(line 148,col 9)-(line 148,col 69)",
        "(line 151,col 9)-(line 151,col 89)",
        "(line 153,col 9)-(line 153,col 71)",
        "(line 154,col 9)-(line 154,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testAvailable()",
      "begin_line": 162,
      "end_line": 174,
      "comment": "\n     * Tests skipping past the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 101)",
        "(line 165,col 9)-(line 165,col 71)",
        "(line 166,col 9)-(line 166,col 47)",
        "(line 167,col 9)-(line 167,col 44)",
        "(line 169,col 9)-(line 169,col 47)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 43)",
        "(line 172,col 9)-(line 172,col 47)",
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 201,col 68)",
        "(line 202,col 9)-(line 202,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 211,
      "end_line": 241,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 74)",
        "(line 215,col 9)-(line 215,col 66)",
        "(line 216,col 9)-(line 216,col 72)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 72)",
        "(line 224,col 9)-(line 224,col 85)",
        "(line 225,col 9)-(line 225,col 41)",
        "(line 226,col 9)-(line 226,col 69)",
        "(line 229,col 9)-(line 229,col 96)",
        "(line 230,col 9)-(line 230,col 55)",
        "(line 231,col 9)-(line 231,col 41)",
        "(line 232,col 9)-(line 232,col 45)",
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 249,
      "end_line": 279,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 74)",
        "(line 253,col 9)-(line 253,col 66)",
        "(line 254,col 9)-(line 254,col 75)",
        "(line 257,col 9)-(line 257,col 55)",
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 259,col 75)",
        "(line 262,col 9)-(line 262,col 85)",
        "(line 263,col 9)-(line 263,col 41)",
        "(line 264,col 9)-(line 264,col 72)",
        "(line 267,col 9)-(line 267,col 96)",
        "(line 268,col 9)-(line 268,col 55)",
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 48)",
        "(line 273,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 299,
      "end_line": 332,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     *\n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param separator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 23)",
        "(line 303,col 9)-(line 303,col 98)",
        "(line 304,col 9)-(line 304,col 57)",
        "(line 306,col 9)-(line 306,col 43)",
        "(line 307,col 9)-(line 307,col 49)",
        "(line 308,col 9)-(line 308,col 78)",
        "(line 310,col 9)-(line 310,col 19)",
        "(line 313,col 9)-(line 313,col 70)",
        "(line 314,col 9)-(line 314,col 50)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 317,col 49)",
        "(line 318,col 9)-(line 318,col 78)",
        "(line 321,col 9)-(line 321,col 47)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 50)",
        "(line 328,col 9)-(line 328,col 43)",
        "(line 329,col 9)-(line 329,col 49)",
        "(line 330,col 9)-(line 330,col 87)",
        "(line 331,col 9)-(line 331,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 352,
      "end_line": 395,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     *\n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param separator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 23)",
        "(line 356,col 9)-(line 356,col 98)",
        "(line 357,col 9)-(line 357,col 49)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 43)",
        "(line 363,col 9)-(line 363,col 49)",
        "(line 364,col 9)-(line 364,col 78)",
        "(line 366,col 9)-(line 366,col 19)",
        "(line 368,col 9)-(line 368,col 70)",
        "(line 369,col 9)-(line 369,col 42)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 43)",
        "(line 375,col 9)-(line 375,col 49)",
        "(line 376,col 9)-(line 376,col 78)",
        "(line 378,col 9)-(line 378,col 19)",
        "(line 381,col 9)-(line 381,col 47)",
        "(line 382,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 42)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 392,col 49)",
        "(line 393,col 9)-(line 393,col 87)",
        "(line 394,col 9)-(line 394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 402,
      "end_line": 410,
      "comment": "\n     * Tests markSupported.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 72)",
        "(line 405,col 9)-(line 405,col 75)",
        "(line 406,col 9)-(line 406,col 97)",
        "(line 408,col 9)-(line 408,col 86)",
        "(line 409,col 9)-(line 409,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 417,
      "end_line": 427,
      "comment": "\n     * Tests read returning 0\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 72)",
        "(line 420,col 9)-(line 420,col 42)",
        "(line 421,col 9)-(line 421,col 26)",
        "(line 422,col 9)-(line 422,col 75)",
        "(line 423,col 9)-(line 423,col 97)",
        "(line 424,col 9)-(line 424,col 39)",
        "(line 425,col 9)-(line 425,col 82)",
        "(line 426,col 9)-(line 426,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 435,
      "end_line": 447,
      "comment": "\n     * Tests read with null.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 72)",
        "(line 438,col 9)-(line 438,col 75)",
        "(line 439,col 9)-(line 439,col 97)",
        "(line 440,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 454,
      "end_line": 489,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 72)",
        "(line 457,col 9)-(line 457,col 42)",
        "(line 458,col 9)-(line 458,col 75)",
        "(line 459,col 9)-(line 459,col 97)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipBig()",
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * Tests skipping number of characters larger than the internal buffer.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 101)",
        "(line 499,col 9)-(line 499,col 71)",
        "(line 500,col 9)-(line 500,col 59)",
        "(line 502,col 9)-(line 502,col 43)",
        "(line 503,col 9)-(line 503,col 43)",
        "(line 504,col 9)-(line 504,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipNone()",
      "begin_line": 512,
      "end_line": 523,
      "comment": "\n     * Tests skipping as a noop\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 101)",
        "(line 515,col 9)-(line 515,col 71)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 517,col 43)",
        "(line 518,col 9)-(line 518,col 59)",
        "(line 519,col 9)-(line 519,col 99)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 522,col 9)-(line 522,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipPastEnd()",
      "begin_line": 530,
      "end_line": 540,
      "comment": "\n     * Tests skipping past the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 101)",
        "(line 533,col 9)-(line 533,col 71)",
        "(line 535,col 9)-(line 535,col 44)",
        "(line 537,col 9)-(line 537,col 43)",
        "(line 538,col 9)-(line 538,col 43)",
        "(line 539,col 9)-(line 539,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipToEnd()",
      "begin_line": 547,
      "end_line": 557,
      "comment": "\n     * Tests skipping to the end of a stream.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 101)",
        "(line 550,col 9)-(line 550,col 71)",
        "(line 552,col 9)-(line 552,col 43)",
        "(line 554,col 9)-(line 554,col 43)",
        "(line 555,col 9)-(line 555,col 43)",
        "(line 556,col 9)-(line 556,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipWrongArgument()",
      "begin_line": 564,
      "end_line": 570,
      "comment": "\n     * Tests if negative arguments to skip are handled correctly.\n     *\n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 101)",
        "(line 567,col 9)-(line 567,col 71)",
        "(line 568,col 9)-(line 568,col 28)",
        "(line 569,col 9)-(line 569,col 26)"
      ]
    }
  ]
}