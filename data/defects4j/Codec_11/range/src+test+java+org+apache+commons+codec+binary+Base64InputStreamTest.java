{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 485,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
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
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec105()",
      "begin_line": 57,
      "end_line": 67,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 100)",
        "(line 60,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 75,
      "end_line": 86,
      "comment": "\n     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java\u0027s builtin InputStreamReader hates that.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 91)",
        "(line 78,col 9)-(line 78,col 71)",
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 39)",
        "(line 81,col 9)-(line 81,col 32)",
        "(line 82,col 9)-(line 82,col 75)",
        "(line 84,col 9)-(line 84,col 28)",
        "(line 85,col 9)-(line 85,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader()",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an\n     * InputStream.read(byte[]) return of 0:\n     * \n     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at\n     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at\n     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at\n     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at\n     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)\n     * \n     * But in commons-codec-1.5 it\u0027s fixed. :-)\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 91)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 107,col 9)-(line 107,col 59)",
        "(line 108,col 9)-(line 108,col 58)",
        "(line 109,col 9)-(line 109,col 52)",
        "(line 110,col 9)-(line 110,col 36)",
        "(line 111,col 9)-(line 111,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 120,
      "end_line": 131,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 79)",
        "(line 123,col 9)-(line 123,col 70)",
        "(line 124,col 9)-(line 124,col 63)",
        "(line 127,col 9)-(line 127,col 83)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 157,col 42)",
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 159,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 168,
      "end_line": 198,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 74)",
        "(line 172,col 9)-(line 172,col 66)",
        "(line 173,col 9)-(line 173,col 72)",
        "(line 176,col 9)-(line 176,col 55)",
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 178,col 72)",
        "(line 181,col 9)-(line 181,col 85)",
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 186,col 9)-(line 186,col 90)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 189,col 45)",
        "(line 192,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 206,
      "end_line": 236,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 74)",
        "(line 210,col 9)-(line 210,col 66)",
        "(line 211,col 9)-(line 211,col 75)",
        "(line 214,col 9)-(line 214,col 55)",
        "(line 215,col 9)-(line 215,col 42)",
        "(line 216,col 9)-(line 216,col 75)",
        "(line 219,col 9)-(line 219,col 85)",
        "(line 220,col 9)-(line 220,col 41)",
        "(line 221,col 9)-(line 221,col 72)",
        "(line 224,col 9)-(line 224,col 90)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 41)",
        "(line 227,col 9)-(line 227,col 48)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 256,
      "end_line": 287,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 59)",
        "(line 260,col 9)-(line 260,col 67)",
        "(line 261,col 9)-(line 261,col 57)",
        "(line 263,col 9)-(line 263,col 43)",
        "(line 264,col 9)-(line 264,col 49)",
        "(line 265,col 9)-(line 265,col 78)",
        "(line 268,col 9)-(line 268,col 47)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 50)",
        "(line 272,col 9)-(line 272,col 43)",
        "(line 273,col 9)-(line 273,col 49)",
        "(line 274,col 9)-(line 274,col 78)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 50)",
        "(line 284,col 9)-(line 284,col 43)",
        "(line 285,col 9)-(line 285,col 49)",
        "(line 286,col 9)-(line 286,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 307,
      "end_line": 347,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 311,col 67)",
        "(line 312,col 9)-(line 312,col 49)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 319,col 9)-(line 319,col 78)",
        "(line 322,col 9)-(line 322,col 47)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 49)",
        "(line 331,col 9)-(line 331,col 78)",
        "(line 334,col 9)-(line 334,col 47)",
        "(line 335,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 43)",
        "(line 345,col 9)-(line 345,col 49)",
        "(line 346,col 9)-(line 346,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 66)",
        "(line 357,col 9)-(line 357,col 69)",
        "(line 358,col 9)-(line 358,col 91)",
        "(line 360,col 9)-(line 360,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 368,
      "end_line": 377,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 66)",
        "(line 371,col 9)-(line 371,col 36)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 373,col 69)",
        "(line 374,col 9)-(line 374,col 91)",
        "(line 375,col 9)-(line 375,col 39)",
        "(line 376,col 9)-(line 376,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 385,
      "end_line": 396,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 66)",
        "(line 388,col 9)-(line 388,col 69)",
        "(line 389,col 9)-(line 389,col 91)",
        "(line 390,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 403,
      "end_line": 437,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 66)",
        "(line 406,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 407,col 69)",
        "(line 408,col 9)-(line 408,col 91)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipNone()",
      "begin_line": 444,
      "end_line": 454,
      "comment": "\n     * Tests skipping as a noop\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 95)",
        "(line 447,col 9)-(line 447,col 65)",
        "(line 448,col 9)-(line 448,col 41)",
        "(line 449,col 9)-(line 449,col 43)",
        "(line 450,col 9)-(line 450,col 59)",
        "(line 451,col 9)-(line 451,col 99)",
        "(line 453,col 9)-(line 453,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipPastEnd()",
      "begin_line": 461,
      "end_line": 469,
      "comment": "\n     * Tests skipping past the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 95)",
        "(line 464,col 9)-(line 464,col 65)",
        "(line 465,col 9)-(line 465,col 44)",
        "(line 467,col 9)-(line 467,col 43)",
        "(line 468,col 9)-(line 468,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testSkipToEnd()",
      "begin_line": 476,
      "end_line": 484,
      "comment": "\n     * Tests skipping to the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 95)",
        "(line 479,col 9)-(line 479,col 65)",
        "(line 480,col 9)-(line 480,col 43)",
        "(line 482,col 9)-(line 482,col 43)",
        "(line 483,col 9)-(line 483,col 43)"
      ]
    }
  ]
}