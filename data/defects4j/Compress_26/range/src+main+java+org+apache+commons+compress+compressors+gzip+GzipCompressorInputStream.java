{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 50,
      "end_line": 395,
      "comment": "\n * Input stream that decompresses .gz files.\n * This supports decompressing concatenated .gz files which is important\n * when decompressing standalone .gz files.\n * \u003cp\u003e\n * {@link java.util.zip.GZIPInputStream} doesn\u0027t decompress concatenated .gz\n * files: it stops after the first member and silently ignores the rest.\n * It doesn\u0027t leave the read position to point to the beginning of the next\n * member, which makes it difficult workaround the lack of concatenation\n * support.\n * \u003cp\u003e\n * Instead of using \u003ccode\u003eGZIPInputStream\u003c/code\u003e, this class has its own .gz\n * container format decoder. The actual decompression is done with\n * {@link java.util.zip.Inflater}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FHCRC"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " private static final int FTEXT \u003d 0x01; // Uninteresting for us"
    },
    {
      "type": "field",
      "varNames": [
        "FEXTRA"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FNAME"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FCOMMENT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FRESERVED"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Compressed input stream, possibly wrapped in a BufferedInputStream"
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " True if decompressing multimember streams."
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Buffer to hold the input data"
    },
    {
      "type": "field",
      "varNames": [
        "bufUsed"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Amount of data in buf."
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Decompressor"
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " CRC32 from uncompressed data"
    },
    {
      "type": "field",
      "varNames": [
        "memberSize"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " True once everything has been decompressed"
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * This is equivalent to\n     * \u003ccode\u003eGzipCompressorInputStream(inputStream, false)\u003c/code\u003e and thus\n     * will not decompress concatenated .gz files.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 125,
      "end_line": 138,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * If \u003ccode\u003edecompressConcatenated\u003c/code\u003e is {@code false}:\n     * This decompressor might read more input than it will actually use.\n     * If \u003ccode\u003einputStream\u003c/code\u003e supports \u003ccode\u003emark\u003c/code\u003e and\n     * \u003ccode\u003ereset\u003c/code\u003e, then the input position will be adjusted\n     * so that it is right after the last byte of the compressed stream.\n     * If \u003ccode\u003emark\u003c/code\u003e isn\u0027t supported, the input position will be\n     * undefined.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .gz member\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 61)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.getMetaData()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Provides the stream\u0027s meta data - may change with each stream\n     * when decompressing concatenated streams.\n     * @return the stream\u0027s meta data\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.init(boolean)",
      "begin_line": 150,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 55)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 31)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 57)",
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 44)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 75)",
        "(line 184,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 65)",
        "(line 198,col 9)-(line 208,col 9)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 232,col 9)-(line 232,col 20)",
        "(line 233,col 9)-(line 233,col 20)",
        "(line 234,col 9)-(line 234,col 23)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.readToNull(java.io.DataInputStream)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 64)",
        "(line 241,col 9)-(line 241,col 18)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.readLittleEndianInt(java.io.DataInputStream)",
      "begin_line": 248,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 252,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 265,
      "end_line": 351,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 21)",
        "(line 273,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byte[], int)",
      "begin_line": 362,
      "end_line": 377,
      "comment": "\n     * Checks if the signature matches what is expected for a .gz file.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .gz stream, false otherwise\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.close()",
      "begin_line": 384,
      "end_line": 394,
      "comment": "\n     * Closes the input stream (unless it is System.in).\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 393,col 9)"
      ]
    }
  ]
}