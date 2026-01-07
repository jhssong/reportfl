{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 43,
      "end_line": 274,
      "comment": "\n * An input stream that decompresses from the Pack200 format to be read\n * as any other stream.\n * \n * \u003cp\u003eThe {@link CompressorInputStream#getCount getCount} and {@link\n * CompressorInputStream#getBytesRead getBytesRead} methods always\n * return 0.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "originalInput"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param mode the strategy to use\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param props Pack200 properties to use\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory.\n     *\n     * @param f the file to decompress\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results.\n     *\n     * @param f the file to decompress\n     * @param mode the strategy to use\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * @param f the file to decompress\n     * @param props Pack200 properties to use\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results and the given properties.\n     *\n     * @param f the file to decompress\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 160,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 51)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Anonymous-5a8ed322-4ea1-4cdb-b34c-d05e328ab86c.close()",
      "begin_line": 173,
      "end_line": 177,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[])",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[], int, int)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.available()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.markSupported()",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.mark(int)",
      "begin_line": 215,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.reset()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.skip(long)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.close()",
      "begin_line": 234,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CAFE_DOOD"
      ],
      "begin_line": 245,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIG_LENGTH"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byte[], int)",
      "begin_line": 261,
      "end_line": 273,
      "comment": "\n     * Checks if the signature matches what is expected for a pack200\n     * file (0xCAFED00D).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a pack200 compressed stream,\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 20)"
      ]
    }
  ]
}