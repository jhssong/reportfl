{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 44,
      "end_line": 523,
      "comment": "\n * The DumpArchiveInputStream reads a UNIX dump archive as an InputStream.\n * Methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "active"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isClosed"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readIdx"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordOffset"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filepos"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raw"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " map of ino -\u003e dirent entry. We can use this to reconstruct full paths."
    },
    {
      "type": "field",
      "varNames": [
        "pending"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " map of ino -\u003e (directory) entry when we\u0027re missing one or more elements in the path."
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " queue of (directory) entries where we now have the full path."
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream)",
      "begin_line": 73,
      "end_line": 117,
      "comment": "\n     * Constructor.\n     *\n     * @param is\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)",
        "(line 75,col 9)-(line 75,col 31)",
        "(line 77,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 47)",
        "(line 103,col 9)-(line 103,col 44)",
        "(line 107,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.Anonymous-939e38d4-59e9-4fd5-9f89-dc01d05ba98f.compare(org.apache.commons.compress.archivers.dump.DumpArchiveEntry, org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 109,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 110,col 25)-(line 112,col 25)",
        "(line 114,col 25)-(line 114,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Return the archive summary information.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI()",
      "begin_line": 140,
      "end_line": 159,
      "comment": "\n     * Read CLRI (deleted inode) segment.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS()",
      "begin_line": 164,
      "end_line": 183,
      "comment": "\n     * Read BITS segment.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 42)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 49)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry()",
      "begin_line": 195,
      "end_line": 288,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 38)",
        "(line 198,col 9)-(line 198,col 27)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 28)",
        "(line 284,col 9)-(line 284,col 82)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 287,col 9)-(line 287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 293,
      "end_line": 376,
      "comment": "\n     * Read directory entry.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 41)",
        "(line 296,col 9)-(line 296,col 29)",
        "(line 298,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 384,
      "end_line": 420,
      "comment": "\n     * Get full path for specified archive entry, or null if there\u0027s a gap.\n     *\n     * @param entry\n     * @return  full path for specified archive entry, or null if there\u0027s a gap.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 53)",
        "(line 388,col 9)-(line 388,col 29)",
        "(line 390,col 9)-(line 402,col 9)",
        "(line 405,col 9)-(line 409,col 9)",
        "(line 412,col 9)-(line 412,col 61)",
        "(line 414,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(byte[], int, int)",
      "begin_line": 435,
      "end_line": 489,
      "comment": "\n     * Reads bytes from the current dump archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param off The offset at which to place bytes read.\n     * @param len The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 26)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 33)",
        "(line 488,col 9)-(line 488,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close()",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\n     * Closes the stream for this entry.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byte[], int)",
      "begin_line": 507,
      "end_line": 521,
      "comment": "\n     * Look at the first few bytes of the file to decide if it\u0027s a dump\n     * archive. With 32 bytes we can look at the magic value, with a full\n     * 1k we can verify the checksum.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 519,col 9)-(line 520,col 16)"
      ]
    }
  ]
}