{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveSummary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveSummary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 333,
      "comment": "\n * This class represents identifying information about a Dump archive volume.\n * It consists the archive\u0027s dump date, label, hostname, device name and possibly\n * last mount point plus the volume\u0027s volume id andfirst record number.\n *\n * For the corresponding C structure see the header of {@link DumpArchiveEntry}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "dumpDate"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousDumpDate"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filesys"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "devname"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hostname"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstrec"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ntrec"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.DumpArchiveSummary(byte[])",
      "begin_line": 44,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 64)",
        "(line 46,col 9)-(line 46,col 72)",
        "(line 47,col 9)-(line 47,col 55)",
        "(line 48,col 9)-(line 48,col 77)",
        "(line 49,col 9)-(line 49,col 55)",
        "(line 50,col 9)-(line 50,col 79)",
        "(line 51,col 9)-(line 51,col 79)",
        "(line 52,col 9)-(line 52,col 80)",
        "(line 53,col 9)-(line 53,col 55)",
        "(line 54,col 9)-(line 54,col 58)",
        "(line 55,col 9)-(line 55,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getDumpDate()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Get the date of this dump.\n     * @return the date of this dump.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setDumpDate(java.util.Date)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Set dump date.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getPreviousDumpDate()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get the date of the previous dump at this level higher.\n     * @return dumpdate may be null\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setPreviousDumpDate(java.util.Date)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Set previous dump date.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getVolume()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Get volume (tape) number.\n     * @return volume (tape) number.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setVolume(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Set volume (tape) number.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getLevel()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Get the level of this dump. This is a number between 0 and 9, inclusive,\n     * and a level 0 dump is a complete dump of the partition. For any other dump\n     * \u0027n\u0027 this dump contains all files that have changed since the last dump\n     * at this level or lower. This is used to support different levels of\n     * incremental backups.\n     * @return dump level\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setLevel(int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Set level.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getLabel()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get dump label. This may be autogenerated or it may be specified\n     * bu the user.\n     * @return dump label\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setLabel(java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Set dump label.\n     * @param label\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFilesystem()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Get the last mountpoint, e.g., /home.\n     * @return last mountpoint\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFilesystem(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Set the last mountpoint.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getDevname()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Get the device name, e.g., /dev/sda3 or /dev/mapper/vg0-home.\n     * @return device name\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setDevname(java.lang.String)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Set the device name.\n     * @param devname\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getHostname()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Get the hostname of the system where the dump was performed.\n     * @return hostname\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setHostname(java.lang.String)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Set the hostname.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFlags()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Get the miscellaneous flags. See below.\n     * @return flags\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFlags(int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Set the miscellaneous flags.\n     * @param flags\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getFirstRecord()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Get the inode of the first record on this volume.\n     * @return inode of the first record on this volume.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setFirstRecord(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Set the inode of the first record.\n     * @param firstrec\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.getNTRec()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Get the number of records per tape block. This is typically\n     * between 10 and 32.\n     * @return the number of records per tape block\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.setNTRec(int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Set the number of records per tape block.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isNewHeader()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Is this the new header format? (We do not currently support the\n     * old format.)\n     *\n     * @return true if using new header format\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isNewInode()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Is this the new inode format? (We do not currently support the\n     * old format.)\n     * @return true if using new inode format\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isCompressed()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Is this volume compressed? N.B., individual blocks may or may not be compressed.\n     * The first block is never compressed.\n     * @return true if volume is compressed\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isMetaDataOnly()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Does this volume only contain metadata?\n     * @return true if volume only contains meta-data\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.isExtendedAttributes()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Does this volume cotain extended attributes.\n     * @return true if volume cotains extended attributes.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.hashCode()",
      "begin_line": 282,
      "end_line": 301,
      "comment": "\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 22)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 30)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveSummary.equals(java.lang.Object)",
      "begin_line": 306,
      "end_line": 332,
      "comment": "\n     * @see java.lang.Object#equals(Object)\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 56)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 331,col 20)"
      ]
    }
  ]
}