package de.mgd.amarok.remote.model;

public class Album {

	private Album(Builder b) {
		id = b.id;
		name = b.name;
		imageId = b.imageId;
		trackCount = b.trackCount;
	}
	
	private final int id;
	private final String name;
	private final int imageId;
	private final int trackCount;
	
	public static class Builder {
		private int id;
		private String name;
		private int imageId;
		private int trackCount;
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setImageId(int imageId) {
			this.imageId = imageId;
			return this;
		}
		public Builder setTrackCount(int trackCount) {
			this.trackCount = trackCount;
			return this;
		}
		
		public Album build() {
			return new Album(this);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getImageId() {
		return imageId;
	}

	public int getTrackCount() {
		return trackCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + imageId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + trackCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (id != other.id)
			return false;
		if (imageId != other.imageId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (trackCount != other.trackCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", name=" + name + ", imageId=" + imageId + ", trackCount=" + trackCount + "]";
	}
	
}
