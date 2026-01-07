{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 44,
      "end_line": 347,
      "comment": "\n * Implements an input stream that can read Zip archives.\n * \u003cp\u003e\n * Note that {@link ZipArchiveEntry#getSize()} may return -1 if the DEFLATE algorithm is used, as the size information\n * is not available from the header.\n * \u003cp\u003e\n * The {@link ZipFile} class is preferred when reading from files.\n *  \n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBytesOfEntry",
        "offsetInBuffer"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 65)",
        "(line 103,col 9)-(line 103,col 59)",
        "(line 104,col 9)-(line 104,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 107,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 23)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 132,col 9)-(line 132,col 56)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 135,col 51)",
        "(line 137,col 9)-(line 137,col 67)",
        "(line 138,col 9)-(line 139,col 72)",
        "(line 140,col 9)-(line 141,col 71)",
        "(line 142,col 9)-(line 142,col 58)",
        "(line 144,col 9)-(line 144,col 21)",
        "(line 146,col 9)-(line 146,col 55)",
        "(line 147,col 9)-(line 147,col 21)",
        "(line 149,col 9)-(line 149,col 70)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 153,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 54)",
        "(line 168,col 9)-(line 168,col 21)",
        "(line 170,col 9)-(line 170,col 51)",
        "(line 171,col 9)-(line 171,col 21)",
        "(line 173,col 9)-(line 173,col 48)",
        "(line 174,col 9)-(line 174,col 28)",
        "(line 175,col 9)-(line 175,col 56)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 29)",
        "(line 179,col 9)-(line 179,col 36)",
        "(line 181,col 9)-(line 181,col 74)",
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 190,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 254,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 275,
      "end_line": 282,
      "comment": "\n     *  This test assumes that the zip file does not have any additional leading content,\n     *  which is something that is allowed by the specification (e.g. self-extracting zips)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 281,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 284,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 293,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 29)",
        "(line 302,col 9)-(line 302,col 21)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 21)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 20)",
        "(line 323,col 9)-(line 324,col 33)",
        "(line 325,col 9)-(line 325,col 20)",
        "(line 326,col 9)-(line 326,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 329,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 338,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 29)",
        "(line 340,col 9)-(line 345,col 9)"
      ]
    }
  ]
}