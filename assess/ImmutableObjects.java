package assess;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public final class ImmutableObjects {
    final List dept;
    final Date date;
    
    public ImmutableObjects(List dept, Date date) {
        this.dept = dept;
        this.date = date;
    }

    public List getDept() {
        // Collections.unmodifiableList(null);
        return new ArrayList<>(dept);
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
Stream
}
