{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 51,
      "end_line": 556,
      "comment": "\n * The DumpArchiveInputStream reads a UNIX dump archive as an InputStream.\n * Methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n *\n * There doesn\u0027t seem to exist a hint on the encoding of string values\n * in any piece documentation.  Given the main purpose of dump/restore\n * is backing up a system it seems very likely the format uses the\n * current default encoding of the system.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "active"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isClosed"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readIdx"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordOffset"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filepos"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raw"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " map of ino -\u003e dirent entry. We can use this to reconstruct full paths."
    },
    {
      "type": "field",
      "varNames": [
        "pending"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " map of ino -\u003e (directory) entry when we\u0027re missing one or more elements in the path."
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " queue of (directory) entries where we now have the full path."
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor using the platform\u0027s default encoding for file\n     * names.\n     *\n     * @param is\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 101,
      "end_line": 148,
      "comment": "\n     * Constructor.\n     *\n     * @param is\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 105,col 9)-(line 105,col 33)",
        "(line 106,col 9)-(line 106,col 70)",
        "(line 108,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 47)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 138,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.Anonymous-ea3c4240-17bd-45f8-bfa5-87b3d892955d.compare(org.apache.commons.compress.archivers.dump.DumpArchiveEntry, org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 141,col 25)-(line 143,col 25)",
        "(line 145,col 25)-(line 145,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Return the archive summary information.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI()",
      "begin_line": 171,
      "end_line": 190,
      "comment": "\n     * Read CLRI (deleted inode) segment.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 41)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS()",
      "begin_line": 195,
      "end_line": 214,
      "comment": "\n     * Read BITS segment.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 41)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 48)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry()",
      "begin_line": 226,
      "end_line": 317,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 313,col 65)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 316,col 9)-(line 316,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 322,
      "end_line": 405,
      "comment": "\n     * Read directory entry.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 41)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 327,col 9)-(line 404,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 413,
      "end_line": 449,
      "comment": "\n     * Get full path for specified archive entry, or null if there\u0027s a gap.\n     *\n     * @param entry\n     * @return  full path for specified archive entry, or null if there\u0027s a gap.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 53)",
        "(line 417,col 9)-(line 417,col 29)",
        "(line 419,col 9)-(line 431,col 9)",
        "(line 434,col 9)-(line 438,col 9)",
        "(line 441,col 9)-(line 441,col 61)",
        "(line 443,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(byte[], int, int)",
      "begin_line": 464,
      "end_line": 522,
      "comment": "\n     * Reads bytes from the current dump archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param off The offset at which to place bytes read.\n     * @param len The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 26)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 33)",
        "(line 521,col 9)-(line 521,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close()",
      "begin_line": 527,
      "end_line": 533,
      "comment": "\n     * Closes the stream for this entry.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byte[], int)",
      "begin_line": 540,
      "end_line": 554,
      "comment": "\n     * Look at the first few bytes of the file to decide if it\u0027s a dump\n     * archive. With 32 bytes we can look at the magic value, with a full\n     * 1k we can verify the checksum.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 553,col 16)"
      ]
    }
  ]
}