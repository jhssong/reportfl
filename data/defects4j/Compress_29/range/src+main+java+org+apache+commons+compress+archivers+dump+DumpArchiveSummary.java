{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveSummary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveSummary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 335,
      "comment": "\n * This class represents identifying information about a Dump archive volume.\n * It consists the archive\u0027s dump date, label, hostname, device name and possibly\n * last mount point plus the volume\u0027s volume id andfirst record number.\n *\n * For the corresponding C structure see the header of {@link DumpArchiveEntry}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "dumpDate"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousDumpDate"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filesys"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "devname"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hostname"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstrec"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ntrec"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.DumpArchiveSummary(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 46,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 64)",
        "(line 48,col 9)-(line 48,col 72)",
        "(line 49,col 9)-(line 49,col 55)",
        "(line 50,col 9)-(line 50,col 99)",
        "(line 51,col 9)-(line 51,col 55)",
        "(line 52,col 9)-(line 52,col 101)",
        "(line 53,col 9)-(line 53,col 101)",
        "(line 54,col 9)-(line 54,col 102)",
        "(line 55,col 9)-(line 55,col 55)",
        "(line 56,col 9)-(line 56,col 58)",
        "(line 57,col 9)-(line 57,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getDumpDate()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Get the date of this dump.\n     * @return the date of this dump.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setDumpDate(java.util.Date)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Set dump date.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getPreviousDumpDate()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Get the date of the previous dump at this level higher.\n     * @return dumpdate may be null\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setPreviousDumpDate(java.util.Date)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Set previous dump date.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getVolume()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Get volume (tape) number.\n     * @return volume (tape) number.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setVolume(int)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Set volume (tape) number.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getLevel()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Get the level of this dump. This is a number between 0 and 9, inclusive,\n     * and a level 0 dump is a complete dump of the partition. For any other dump\n     * \u0027n\u0027 this dump contains all files that have changed since the last dump\n     * at this level or lower. This is used to support different levels of\n     * incremental backups.\n     * @return dump level\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setLevel(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Set level.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getLabel()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get dump label. This may be autogenerated or it may be specified\n     * bu the user.\n     * @return dump label\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setLabel(java.lang.String)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Set dump label.\n     * @param label\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFilesystem()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Get the last mountpoint, e.g., /home.\n     * @return last mountpoint\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFilesystem(java.lang.String)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Set the last mountpoint.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getDevname()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Get the device name, e.g., /dev/sda3 or /dev/mapper/vg0-home.\n     * @return device name\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setDevname(java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Set the device name.\n     * @param devname\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getHostname()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Get the hostname of the system where the dump was performed.\n     * @return hostname\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setHostname(java.lang.String)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Set the hostname.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFlags()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Get the miscellaneous flags. See below.\n     * @return flags\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFlags(int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Set the miscellaneous flags.\n     * @param flags\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFirstRecord()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Get the inode of the first record on this volume.\n     * @return inode of the first record on this volume.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFirstRecord(int)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Set the inode of the first record.\n     * @param firstrec\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getNTRec()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Get the number of records per tape block. This is typically\n     * between 10 and 32.\n     * @return the number of records per tape block\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setNTRec(int)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Set the number of records per tape block.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isNewHeader()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Is this the new header format? (We do not currently support the\n     * old format.)\n     *\n     * @return true if using new header format\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isNewInode()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Is this the new inode format? (We do not currently support the\n     * old format.)\n     * @return true if using new inode format\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isCompressed()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Is this volume compressed? N.B., individual blocks may or may not be compressed.\n     * The first block is never compressed.\n     * @return true if volume is compressed\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isMetaDataOnly()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Does this volume only contain metadata?\n     * @return true if volume only contains meta-data\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isExtendedAttributes()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Does this volume cotain extended attributes.\n     * @return true if volume cotains extended attributes.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.hashCode()",
      "begin_line": 284,
      "end_line": 303,
      "comment": "\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 22)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.equals(java.lang.Object)",
      "begin_line": 308,
      "end_line": 334,
      "comment": "\n     * @see java.lang.Object#equals(Object)\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 56)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 20)"
      ]
    }
  ]
}