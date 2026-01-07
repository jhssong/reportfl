{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 50,
      "end_line": 385,
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
        "endReached"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " True once everything has been decompressed"
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * This is equivalent to\n     * \u003ccode\u003eGzipCompressorInputStream(inputStream, false)\u003c/code\u003e and thus\n     * will not decompress concatenated .gz files.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\n     * Constructs a new input stream that decompresses gzip-compressed data\n     * from the specified input stream.\n     * \u003cp\u003e\n     * If \u003ccode\u003edecompressConcatenated\u003c/code\u003e is {@code false}:\n     * This decompressor might read more input than it will actually use.\n     * If \u003ccode\u003einputStream\u003c/code\u003e supports \u003ccode\u003emark\u003c/code\u003e and\n     * \u003ccode\u003ereset\u003c/code\u003e, then the input position will be adjusted\n     * so that it is right after the last byte of the compressed stream.\n     * If \u003ccode\u003emark\u003c/code\u003e isn\u0027t supported, the input position will be\n     * undefined.\n     *\n     * @param inputStream  the InputStream from which this object should\n     *                     be created of\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .gz member\n     *\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.getMetaData()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Provides the stream\u0027s meta data - may change with each stream\n     * when decompressing concatenated streams.\n     * @return the stream\u0027s meta data\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.init(boolean)",
      "begin_line": 148,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 55)",
        "(line 152,col 9)-(line 152,col 37)",
        "(line 153,col 9)-(line 153,col 37)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 168,col 63)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 75)",
        "(line 182,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 65)",
        "(line 196,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 20)",
        "(line 231,col 9)-(line 231,col 20)",
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.readToNull(java.io.DataInputStream)",
      "begin_line": 236,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 70)",
        "(line 238,col 9)-(line 238,col 18)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.readLittleEndianInt(java.io.DataInputStream)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 249,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 262,
      "end_line": 341,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 21)",
        "(line 270,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byte[], int)",
      "begin_line": 352,
      "end_line": 367,
      "comment": "\n     * Checks if the signature matches what is expected for a .gz file.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .gz stream, false otherwise\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.close()",
      "begin_line": 374,
      "end_line": 384,
      "comment": "\n     * Closes the input stream (unless it is System.in).\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 383,col 9)"
      ]
    }
  ]
}