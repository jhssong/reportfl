{
  "filepath": "/tmp/Compress-12b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 47,
      "end_line": 335,
      "comment": "\n * Input stream that decompresses .gz files.\n * This supports decompressing concatenated .gz files which is important\n * when decompressing standalone .gz files.\n * \u003cp\u003e\n * {@link java.util.zip.GZIPInputStream} doesn\u0027t decompress concatenated .gz\n * files: it stops after the first member and silently ignores the rest.\n * It doesn\u0027t leave the read position to point to the beginning of the next\n * member, which makes it difficult workaround the lack of concatenation\n * support.\n * \u003cp\u003e\n * Instead of using \u003ccode\u003eGZIPInputStream\u003c/code\u003e, this class has its own .gz\n * container format decoder. The actual decompression is done with\n * {@link java.util.zip.Inflater}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FHCRC"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " private static final int FTEXT \u003d 0x01; // Uninteresting for us"
    },
    {
      "type": "field",
      "varNames": [
        "FEXTRA"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FNAME"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FCOMMENT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FRESERVED"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Compressed input stream, possibly wrapped in a BufferedInputStream"
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " True if decompressing multimember streams."
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Buffer to hold the input data"
    },
    {
      "type": "field",
      "varNames": [
        "bufUsed"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Amount of data in buf."
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Decompressor"
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " CRC32 from uncompressed data"
    },
    {
      "type": "field",
      "varNames": [
        "memberSize"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " True once everything has been decompressed"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * This is equivalent to\n     * \u003ccode\u003eGzipCompressorInputStream(inputStream, false)\u003c/code\u003e and thus\n     * will not decompress concatenated .gz files.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 117,
      "end_line": 129,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * If \u003ccode\u003edecompressConcatenated\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e:\n     * This decompressor might read more input than it will actually use.\n     * If \u003ccode\u003einputStream\u003c/code\u003e supports \u003ccode\u003emark\u003c/code\u003e and\n     * \u003ccode\u003ereset\u003c/code\u003e, then the input position will be adjusted\n     * so that it is right after the last byte of the compressed stream.\n     * If \u003ccode\u003emark\u003c/code\u003e isn\u0027t supported, the input position will be\n     * undefined.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .gz member\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 125,col 54)",
        "(line 127,col 9)-(line 127,col 61)",
        "(line 128,col 9)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.init(boolean)",
      "begin_line": 131,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 55)",
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 136,col 31)",
        "(line 140,col 9)-(line 141,col 25)",
        "(line 143,col 9)-(line 146,col 72)",
        "(line 149,col 9)-(line 149,col 57)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 153,col 67)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 158,col 64)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 34)",
        "(line 165,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 178,col 56)",
        "(line 181,col 9)-(line 182,col 56)",
        "(line 189,col 9)-(line 190,col 31)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 20)",
        "(line 195,col 9)-(line 195,col 23)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read()",
      "begin_line": 201,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 33)",
        "(line 204,col 9)-(line 204,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 212,
      "end_line": 291,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 215,col 22)",
        "(line 217,col 9)-(line 217,col 21)",
        "(line 219,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byte[], int)",
      "begin_line": 302,
      "end_line": 317,
      "comment": "\n     * Checks if the signature matches what is expected for a .gz file.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .gz stream, false otherwise\n     *\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.close()",
      "begin_line": 324,
      "end_line": 334,
      "comment": "\n     * Closes the input stream (unless it is System.in).\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 333,col 9)"
      ]
    }
  ]
}