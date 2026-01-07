{
  "filepath": "/tmp/Codec-7b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 415,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.Base64InputStreamTest(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 57,
      "end_line": 67,
      "comment": "\n     * Test for the CODEC-101 bug:  InputStream.read(byte[]) should never return 0\n     * because Java\u0027s builtin InputStreamReader hates that.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 91)",
        "(line 59,col 9)-(line 59,col 71)",
        "(line 60,col 9)-(line 60,col 59)",
        "(line 61,col 9)-(line 61,col 39)",
        "(line 62,col 9)-(line 62,col 32)",
        "(line 63,col 9)-(line 63,col 75)",
        "(line 65,col 9)-(line 65,col 28)",
        "(line 66,col 9)-(line 66,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader()",
      "begin_line": 88,
      "end_line": 96,
      "comment": "\n     * Another test for the CODEC-101 bug:\n     * In commons-codec-1.4 this test shows InputStreamReader explicitly hating an\n     * InputStream.read(byte[]) return of 0:\n     *\n     * java.io.IOException: Underlying input stream returned zero bytes\n     * at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268)\n     * at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306)\n     * at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158)\n     * at java.io.InputStreamReader.read(InputStreamReader.java:167)\n     * at java.io.BufferedReader.fill(BufferedReader.java:136)\n     * at java.io.BufferedReader.readLine(BufferedReader.java:299)\n     * at java.io.BufferedReader.readLine(BufferedReader.java:362)\n     * at org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)\n     *\n     * But in commons-codec-1.5 it\u0027s fixed.  :-)\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 91)",
        "(line 90,col 9)-(line 90,col 71)",
        "(line 91,col 9)-(line 91,col 59)",
        "(line 92,col 9)-(line 92,col 58)",
        "(line 93,col 9)-(line 93,col 52)",
        "(line 94,col 9)-(line 94,col 36)",
        "(line 95,col 9)-(line 95,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 104,
      "end_line": 116,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 79)",
        "(line 106,col 9)-(line 106,col 70)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 110,col 9)-(line 110,col 83)",
        "(line 112,col 9)-(line 112,col 65)",
        "(line 113,col 9)-(line 115,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 138,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 141,col 68)",
        "(line 142,col 9)-(line 142,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 151,
      "end_line": 180,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 74)",
        "(line 154,col 9)-(line 154,col 66)",
        "(line 155,col 9)-(line 155,col 68)",
        "(line 158,col 9)-(line 158,col 55)",
        "(line 159,col 9)-(line 159,col 39)",
        "(line 160,col 9)-(line 160,col 68)",
        "(line 163,col 9)-(line 163,col 85)",
        "(line 164,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 165,col 65)",
        "(line 168,col 9)-(line 168,col 90)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 41)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 174,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 188,
      "end_line": 217,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 74)",
        "(line 191,col 9)-(line 191,col 66)",
        "(line 192,col 9)-(line 192,col 71)",
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 196,col 39)",
        "(line 197,col 9)-(line 197,col 71)",
        "(line 200,col 9)-(line 200,col 85)",
        "(line 201,col 9)-(line 201,col 41)",
        "(line 202,col 9)-(line 202,col 68)",
        "(line 205,col 9)-(line 205,col 90)",
        "(line 206,col 9)-(line 206,col 55)",
        "(line 207,col 9)-(line 207,col 41)",
        "(line 208,col 9)-(line 208,col 48)",
        "(line 211,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 237,
      "end_line": 268,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 59)",
        "(line 241,col 9)-(line 241,col 67)",
        "(line 242,col 9)-(line 242,col 57)",
        "(line 244,col 9)-(line 244,col 43)",
        "(line 245,col 9)-(line 245,col 49)",
        "(line 246,col 9)-(line 246,col 78)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 250,col 39)",
        "(line 251,col 9)-(line 251,col 50)",
        "(line 253,col 9)-(line 253,col 43)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 78)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 50)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 267,col 9)-(line 267,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 288,
      "end_line": 328,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 59)",
        "(line 292,col 9)-(line 292,col 67)",
        "(line 293,col 9)-(line 293,col 49)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 43)",
        "(line 299,col 9)-(line 299,col 49)",
        "(line 300,col 9)-(line 300,col 78)",
        "(line 303,col 9)-(line 303,col 47)",
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 43)",
        "(line 311,col 9)-(line 311,col 49)",
        "(line 312,col 9)-(line 312,col 78)",
        "(line 315,col 9)-(line 315,col 47)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 42)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 49)",
        "(line 327,col 9)-(line 327,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 335,
      "end_line": 341,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 66)",
        "(line 337,col 9)-(line 337,col 69)",
        "(line 338,col 9)-(line 338,col 88)",
        "(line 340,col 9)-(line 340,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 348,
      "end_line": 356,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 66)",
        "(line 350,col 9)-(line 350,col 36)",
        "(line 351,col 9)-(line 351,col 26)",
        "(line 352,col 9)-(line 352,col 69)",
        "(line 353,col 9)-(line 353,col 88)",
        "(line 354,col 9)-(line 354,col 39)",
        "(line 355,col 9)-(line 355,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 364,
      "end_line": 374,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 66)",
        "(line 366,col 9)-(line 366,col 69)",
        "(line 367,col 9)-(line 367,col 88)",
        "(line 368,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 381,
      "end_line": 414,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 66)",
        "(line 383,col 9)-(line 383,col 36)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 385,col 88)",
        "(line 387,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 413,col 9)"
      ]
    }
  ]
}