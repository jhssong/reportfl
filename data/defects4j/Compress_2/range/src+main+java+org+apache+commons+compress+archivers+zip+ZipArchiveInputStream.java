{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 37,
      "end_line": 345,
      "comment": "\n * Implements and input stream that can read Zip archives.\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBytesOfEntry",
        "offsetInBuffer"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 65)",
        "(line 97,col 9)-(line 97,col 59)",
        "(line 98,col 9)-(line 98,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 101,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 124,col 40)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 129,col 51)",
        "(line 131,col 9)-(line 131,col 67)",
        "(line 132,col 9)-(line 133,col 72)",
        "(line 134,col 9)-(line 135,col 71)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 138,col 9)-(line 138,col 21)",
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 141,col 21)",
        "(line 143,col 9)-(line 143,col 70)",
        "(line 144,col 9)-(line 144,col 30)",
        "(line 145,col 9)-(line 145,col 20)",
        "(line 147,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 54)",
        "(line 162,col 9)-(line 162,col 21)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 165,col 9)-(line 165,col 21)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 28)",
        "(line 169,col 9)-(line 169,col 56)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 175,col 9)-(line 175,col 74)",
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 184,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 240,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 252,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 273,
      "end_line": 280,
      "comment": "\n     *  This test assumes that the zip file does not have any additional leading content,\n     *  which is something that is allowed by the specification (e.g. self-extracting zips)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 279,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 282,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 291,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 21)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 21)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 20)",
        "(line 321,col 9)-(line 322,col 33)",
        "(line 323,col 9)-(line 323,col 20)",
        "(line 324,col 9)-(line 324,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 327,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 336,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 29)",
        "(line 338,col 9)-(line 343,col 9)"
      ]
    }
  ]
}