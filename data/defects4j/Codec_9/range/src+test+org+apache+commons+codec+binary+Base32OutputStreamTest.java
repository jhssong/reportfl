{
  "filepath": "/tmp/Codec-9b/src/test/org/apache/commons/codec/binary/Base32OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32OutputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.Base32OutputStreamTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStreamMimeChunkSize()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Test the Base32OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStreamPemChunkSize()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Test the Base32OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStream(int)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 68)",
        "(line 89,col 9)-(line 89,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32OutputStreamByChunk()",
      "begin_line": 98,
      "end_line": 123,
      "comment": "\n     * Test the Base32OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 81)",
        "(line 101,col 9)-(line 101,col 81)",
        "(line 102,col 9)-(line 102,col 68)",
        "(line 117,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32OutputStreamByteByByte()",
      "begin_line": 131,
      "end_line": 156,
      "comment": "\n     * Test the Base32OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 81)",
        "(line 134,col 9)-(line 134,col 81)",
        "(line 135,col 9)-(line 135,col 51)",
        "(line 150,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 176,
      "end_line": 206,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            Base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the Base32 encoded data.\n     * @param seperator\n     *            Line separator in the Base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 68)",
        "(line 180,col 9)-(line 180,col 87)",
        "(line 181,col 9)-(line 181,col 27)",
        "(line 182,col 9)-(line 182,col 20)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 86)",
        "(line 187,col 9)-(line 187,col 46)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 20)",
        "(line 191,col 9)-(line 191,col 39)",
        "(line 192,col 9)-(line 192,col 86)",
        "(line 195,col 9)-(line 195,col 46)",
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 27)",
        "(line 202,col 9)-(line 202,col 20)",
        "(line 203,col 9)-(line 203,col 39)",
        "(line 205,col 9)-(line 205,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 226,
      "end_line": 273,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            Base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the Base32 encoded data.\n     * @param seperator\n     *            Line separator in the Base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 68)",
        "(line 230,col 9)-(line 230,col 87)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 20)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 91)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 20)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 91)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 20)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 99)",
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 261,col 22)",
        "(line 262,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 20)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 272,col 9)-(line 272,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 281,
      "end_line": 313,
      "comment": "\n     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 36)",
        "(line 283,col 9)-(line 283,col 65)",
        "(line 284,col 9)-(line 284,col 62)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testWriteToNullCoverage()",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Tests Base32OutputStream.write(null).\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 65)",
        "(line 323,col 9)-(line 323,col 62)",
        "(line 324,col 9)-(line 329,col 9)"
      ]
    }
  ]
}