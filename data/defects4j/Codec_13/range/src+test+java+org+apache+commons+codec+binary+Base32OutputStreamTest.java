{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/Base32OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32OutputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStreamMimeChunkSize()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Test the Base32OutputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStreamPemChunkSize()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Test the Base32OutputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32EmptyOutputStream(int)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 68)",
        "(line 87,col 9)-(line 87,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32OutputStreamByChunk()",
      "begin_line": 96,
      "end_line": 123,
      "comment": "\n     * Test the Base32OutputStream implementation\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 81)",
        "(line 100,col 9)-(line 100,col 81)",
        "(line 101,col 9)-(line 101,col 72)",
        "(line 116,col 9)-(line 116,col 46)",
        "(line 117,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testBase32OutputStreamByteByByte()",
      "begin_line": 131,
      "end_line": 158,
      "comment": "\n     * Test the Base32OutputStream implementation\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 81)",
        "(line 135,col 9)-(line 135,col 81)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 151,col 9)-(line 151,col 46)",
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 178,
      "end_line": 208,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     *\n     * @param encoded\n     *            Base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the Base32 encoded data.\n     * @param separator\n     *            Line separator in the Base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 68)",
        "(line 182,col 9)-(line 182,col 87)",
        "(line 183,col 9)-(line 183,col 27)",
        "(line 184,col 9)-(line 184,col 20)",
        "(line 185,col 9)-(line 185,col 46)",
        "(line 186,col 9)-(line 186,col 86)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 27)",
        "(line 192,col 9)-(line 192,col 20)",
        "(line 193,col 9)-(line 193,col 39)",
        "(line 194,col 9)-(line 194,col 86)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 198,col 9)-(line 198,col 22)",
        "(line 199,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 27)",
        "(line 204,col 9)-(line 204,col 20)",
        "(line 205,col 9)-(line 205,col 39)",
        "(line 207,col 9)-(line 207,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 228,
      "end_line": 275,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     *\n     * @param encoded\n     *            Base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the Base32 encoded data.\n     * @param separator\n     *            Line separator in the Base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 68)",
        "(line 232,col 9)-(line 232,col 87)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 20)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 238,col 91)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)",
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 248,col 91)",
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 99)",
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 22)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 20)",
        "(line 272,col 9)-(line 272,col 39)",
        "(line 274,col 9)-(line 274,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 283,
      "end_line": 317,
      "comment": "\n     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 71)",
        "(line 287,col 9)-(line 287,col 68)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32OutputStreamTest.testWriteToNullCoverage()",
      "begin_line": 325,
      "end_line": 336,
      "comment": "\n     * Tests Base32OutputStream.write(null).\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 71)",
        "(line 328,col 9)-(line 328,col 68)",
        "(line 329,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    }
  ]
}